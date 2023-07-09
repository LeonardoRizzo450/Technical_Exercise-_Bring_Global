package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RyanairMainPage;
import pages.RyanairBookPage;

public class RyanairMainSteps {

    @When("I search for a trip between \"(.*)\" and \"(.*)\"")
    public void pesquisarProduto(String Departure, String Destination){
        RyanairMainPage ryanairMainPage = new RyanairMainPage();
        ryanairMainPage.searchATrip(Departure, Destination);
    }

    @And("I select the departure date as July 10th, 2023")
    public void selectDepartureDate(){
        RyanairMainPage ryanairMainPage = new RyanairMainPage();
        ryanairMainPage.selectDepartureDate();
    }

    @And("I select the return date as August 30th, 2023")
    public void selecDestinationDate(){
        RyanairMainPage ryanairMainPage = new RyanairMainPage();
        ryanairMainPage.selectDestinationDate();
    }

    @And("I select 2 adults and 1 child")
    public void selectPassagers(){
        RyanairMainPage ryanairMainPage = new RyanairMainPage();
        ryanairMainPage.selectPassagengers();
    }

    @Then("the flight results page is displayed")
    public void validateDepartureDestination(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.validateDepartureDestination();
    }

    @When("I add the flight to my booking")
    public void addFlightBook(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.selectDates();
    }

    @And("I change the departure date to December 6th, 2023")
    public void selectNewDate(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.selectNewDate();
    }

    @Then("the booking details page is displayed")
    public void validateBookingDetails(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.validateBookingDate();
    }

    @When("I select the correct dates and choose the Tarifa value option")
    public void selectTarifaValue(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.addValue();
    }

    @When("I fill in the passenger details with the following data:")
    public void fillPassengersNames(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.fillNames();
    }

    @Then("the seat selection page is displayed")
    public void validateSeatDisplay(){
        RyanairBookPage ryanairBookPage = new RyanairBookPage();
        ryanairBookPage.validateBookingDate();
    }
}
