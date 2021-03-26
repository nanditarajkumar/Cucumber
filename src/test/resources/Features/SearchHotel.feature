Feature: Booking a hotel
@Reg
  Scenario Outline: Search a hotel by selecting all the fields
    Given user is on adactin page
    When user should enter "<username>" and "<password>" and click login button
    And user should navigate to search hotel page
    And user should enter "<location>","<hotel>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    Then user should navigate to select hotel page

    Examples: 
      | username  | password    | location | hotel       | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Karthi007 | Karthi@1989 | Sydney   | Hotel Creek | Double   | 1 - One       | 24/03/21    | 25/03/21     | 2 - Two       | 0 - None        |
@Smoke
  Scenario Outline: Verifying the mandatory fields and navigating to select hotel page
    Given userOne is on adactin page
    When userOne should enter "<username>" and "<password>" and click login button
    And userOne should navigate to select hotel page
    And userOne should enter "<location>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"

    Examples: 
      | username  | password    | location | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Karthi007 | Karthi@1989 | Sydney   | 1 - One       | 24/03/21    | 25/03/21     | 2 - Two       |
@Smoke
  Scenario Outline: Checking the date credentials
    Given userTwo is on adactin page
    When userTwo should enter "<username>" and "<password>"and click login button
    And userTwo should navigate to select hotel page
    And userTwo should enter "<location>","<hotel>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    Then userTwo should verify error message in date

    Examples: 
      | username  | password    | location | hotel       | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Karthi007 | Karthi@1989 | Sydney   | Hotel Creek | Double   | 1 - One       | 24/03/21    | 25/02/21     | 2 - Two       | 0 - None        |
@Smoke @Reg
  Scenario Outline: Searching a hotel without selecting any fields
    Given userThree is on adactin page
    When userThree should enter "<username>" and "<password>"and click login button
    And userThree should navigate to select hotel page
    Then userThree should click the search button and verify error message

    Examples: 
      | username  | password    |
      | Karthi007 | Karthi@1989 |
