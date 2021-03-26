Feature: Booking a hotel in adactin page and generate order id
@Reg
  Scenario Outline: Booking a Hotel with valid credentials
    Given userFour is on adactin page
    When userFour should enter "<username>" and "<password>"
    And userFour should click login button and naviagate to hotel page
    And userFour should enter "<location>","<hotel>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    And userFour should click search button and user is on select hotel page , click that radio button and user should click continue button
    And userFour should enter the "<firstname>","<lastname>","<address>"
    Then userFour should verify success message
      | creditCardNo     | creditCardType   | expiryMonth | expiryYear | CVVNumber |
      | 1234567890101010 | American Express | January     |       2022 |       321 |
      | 1234567890101111 | VISA             | April       |       2019 |       333 |
      | 1234567890101222 | Master Card      | December    |       2021 |       322 |
      | 1234567890101333 | Others           | May         |       2020 |       111 |

    Examples: 
      | username  | password    | location | hotel       | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstname | lastname | address |
      | Karthi007 | Karthi@1989 | Sydney   | Hotel Creek | Double   | 1 - One       | 24/03/21    | 25/03/21     | 2 - Two       | 0 - None        | Nandita   | Rajkumar | Chennai |
@Smoke @Reg
  Scenario Outline: Booking a hotel without entering any fields in select hotel page
    Given userFive is on adactin page
    When userFive should enter "<username>" and "<password>"
    And userFive should click login button and navigate to search hotel page
    And userFive should enter "<location>","<hotel>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    And userFive should click search button and user is on select hotel page
    And userFive should click the radio button and click continue button
    And userFive should not enter any credentials and click book now button
    Then userFive should verify 7 error message

    Examples: 
      | username  | password    | location | hotel       | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Karthi007 | Karthi@1989 | Sydney   | Hotel Creek | Double   | 1 - One       | 24/03/21    | 25/03/21     | 2 - Two       | 0 - None        |
