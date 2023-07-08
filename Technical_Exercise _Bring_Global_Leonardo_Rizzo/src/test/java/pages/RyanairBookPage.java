package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RyanairBookPage extends RyanairElementMap {

        public RyanairBookPage(){
        PageFactory.initElements(driver, this);
    }

    public void validateDepartureDestination(){
        waitVisibilityOf(lblDepartureDestination);
        String departureDestination = lblDepartureDestination.getText();
        Assert.assertEquals("Lisbon to Paris Beauvais", departureDestination);
    }

    public void selectDates(){
        waitElementClick(btnSelect);
        btnSelect.click();
        btnSelect.click();      
    }

    public void selectNewDate(){
        waitElementClick(btnEditFlight);
        btnEditFlight.click();
        waitElementClick(btnNextDates);
        findDepartureDate("2023-12-06");
        findDestinationDate("2023-12-12");       
    }
    //Metodo para a seleção da data de dezembro pelo carossel
    public void findDepartureDate(String date){
        for (WebElement elemento : lblFlightDate) {
            String dateText = elemento.getAttribute("data-ref");
            if (dateText.equals(date)) {
                btnNewDepartureDate.click();
                waitElementClick(btnSelect);
                return;
            }
        }
        btnNextDates.click();
        findDepartureDate(date);
    }

    //Metodo para a seleção da data de dezembro pelo carossel
    public void findDestinationDate(String date){
        for (WebElement elemento : lblFlightDate) {
            String dateText = elemento.getAttribute("data-ref");
            if (dateText.equals(date)) {
                btnNewDepartureDate.click();
                waitElementClick(btnSelect);
                return;
            }
        }
        btnNextDates.click();
        findDepartureDate(date);
    }

    public void validateBookingDate(){
        String dateFirst = lblFirstValidateDate.getText();
        String dateSecond = lblSecondValidateDate.getText();
        waitVisibilityOf(dateFirstDate);
        Assert.assertEquals("06-Dec", dateFirst);
        Assert.assertEquals("12-Dec", dateSecond);
    }

    public void addValue(){
        waitElementClick(btnContinueValue);
        btnContinueValue.click();
        waitElementClick(btnContinueWithValueFare);
        btnContinueWithValueFare.click();
        waitElementClick(btnLogLater);
        btnLogLater.click();
    }

    public void fillNames(){
        waitElementClick(dropTitle);
        dropTitle.click();
        waitElementClick(firstTitle);
        firstTitle.click();
        firstNameFirstPassanger.sendKeys("Sonia");
        lastNameFirstPassanger.sendKeys("Pereira");
        dropTitleSecond.click();
        waitElementClick(secondTitle);
        secondTitle.click();
        firstNameSecondPassanger.sendKeys("Diogo");
        lastNameSecondPassanger.sendKeys("Bettencourt");
        firstNameThirdPassanger.sendKeys("Ines");
        lastNameThirdPassanger.sendKeys("Marcal");
        btnContinue.click();
    }



}
