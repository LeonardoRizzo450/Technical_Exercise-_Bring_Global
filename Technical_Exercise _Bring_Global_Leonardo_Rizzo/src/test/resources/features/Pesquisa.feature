#@run
Feature: Search and book a flight on Ryanair website
    
    @run
    Scenario: Book a flight from Lisbon to Paris Beauvais
      Given I am on the Ryanair website
      When I search for a trip between "Lisbon" and "Paris Beauvais"
      And I select the departure date as July 10th, 2023
      And I select the return date as August 30th, 2023
      And I select 2 adults and 1 child
      Then the flight results page is displayed
      When I add the flight to my booking
      And I change the departure date to December 6th, 2023
      And I change the return date to December 12th, 2023 using the lateral scroll
      Then the booking details page is displayed
      When I select the correct dates and choose the Tarifa value option
      When I fill in the passenger details with the following data:
        | Name              |
        | Sónia Pereira     |
        | Diogo Bettencourt |
        | Inês Marçal       |
      Then the seat selection page is displayed
      #Then the package selection page is displayed
      #When I select a small package
      #Then the seat selection page is displayed again
      #When I select the seats - using the same seats for the return trip
      #Then the booking summary page is displayed
      #When I continue to payment
      #Then the payment page is displayed
