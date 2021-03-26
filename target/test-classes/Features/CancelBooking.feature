Feature: Cancelling a booking in adactin page

  @Reg
  Scenario Outline: Cancelling a Booked hotel after generating order id
    Given userSix is on adactin page
    When userSix should enter "<username>" and "<password>"
    And userSix should click login button and naviagate to hotel page
    And userSix should enter "<location>","<hotel>","<roomType>","<numberOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>","<childrenPerRoom>"
    And userSix should click search button and user is on select hotel page , click that radio button and user should click continue button
    And userSix should enter the "<firstname>","<lastname>","<address>"
    And userSix should click the Booked Itinerary
    Then userSix should click the cancel id button and verify the message
      | creditCardNo     | creditCardType   | expiryMonth | expiryYear | CVVNumber |
      | 1234567890101010 | American Express | January     |       2022 |       321 |
      | 1234567890101111 | VISA             | April       |       2019 |       333 |
      | 1234567890101222 | Master Card      | December    |       2021 |       322 |
      | 1234567890101333 | Others           | May         |       2020 |       111 |

    Examples: 
      | username  | password    | location | hotel       | roomType | numberOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstname | lastname | address |
      | Karthi007 | Karthi@1989 | Sydney   | Hotel Creek | Double   | 1 - One       | 24/03/21    | 25/03/21     | 2 - Two       | 0 - None        | Nandita   | Rajkumar | Chennai |

  @Reg
  Scenario Outline: Cancelling an already booked hotel
    Given userSeven is on adactin page
    When userSeven should enter "<username>" and "<password>"
    And userSeven should click login button and naviagate to hotel page
    And userSeven should click the Booked Itinerary
    Then userSeven should click the cancel id button and verify the message

    Examples: 
      | username  | password    |
      | Karthi007 | Karthi@1989 |
