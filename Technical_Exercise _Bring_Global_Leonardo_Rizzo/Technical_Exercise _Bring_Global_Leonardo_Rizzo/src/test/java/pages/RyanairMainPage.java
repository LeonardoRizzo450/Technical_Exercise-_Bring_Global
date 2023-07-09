package pages;

import org.openqa.selenium.support.PageFactory;

public class RyanairMainPage extends RyanairElementMap {

    public RyanairMainPage(){
        PageFactory.initElements(driver, this);
    }
    //Metodo para seleção Partida ao Destino
    public void searchATrip(String Departure, String Destination){
        waitVisibilityOf(btnAcceptCookies);
        btnAcceptCookies.click();
        waitElementClick(txtSeachDeparture);
        txtSeachDeparture.click();
        waitVisibilityOf(btnClearSelection);
        btnClearSelection.click();
        txtSeachDeparture.sendKeys(Departure);
        waitElementClick(btnLisbon);
        btnLisbon.click();
        txtSeachDestination.sendKeys(Destination);
        waitElementClick(btnParisBeauvais);
        btnParisBeauvais.click();
    }
    //Metodo para a seleção da data de partida (Precisei alterar a data de partida diferente do exercicio pois o site so permitia seleção a partir da data atual 08/07/2023)
    public void selectDepartureDate(){
        waitVisibilityOf(dateCalendar);
        waitElementClick(dateFirstDate);
        dateFirstDate.click();
    }
    //Metodo para a seleção da data de Retorno (Precisei alterar a data de partida diferente do exercicio pois o site so permitia seleção a partir da data atual 08/07/2023)
    public void selectDestinationDate(){
        waitElementClick(dateSecondDate);
        dateSecondDate.click();
    }

    //Metodo para a seleção dos Passageiros
    public void selectPassagengers(){
        waitElementClick(btnSelectAdults);
        btnSelectAdults.click();
        waitElementClick(btnSelectChildren);
        btnSelectChildren.click();
        waitElementClick(btnDone);
        btnDone.click();
        waitElementClick(btnSearch);
        btnSearch.click();
    }

}
