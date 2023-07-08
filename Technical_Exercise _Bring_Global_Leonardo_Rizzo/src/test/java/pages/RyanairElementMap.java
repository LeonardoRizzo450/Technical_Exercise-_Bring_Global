package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RyanairElementMap extends CommonPage {

    //classe para o mapeamento de todos os elementos das pages

    @FindBy(xpath = "//*[@data-ref='cookie.accept-all']")
    protected WebElement btnAcceptCookies;

    @FindBy(xpath = "//*[@class='list__clear-selection ry-button--anchor-blue ry-button--anchor']")
    protected WebElement btnClearSelection;

    @FindBy(id = "input-button__departure")
    protected WebElement txtSeachDeparture;

    @FindBy(xpath = "//*[@data-id='LIS']")
    protected WebElement btnLisbon;

    @FindBy(id = "input-button__destination")
    protected WebElement txtSeachDestination;

    @FindBy(xpath = "//*[@data-id='BVA']")
    protected WebElement btnParisBeauvais;

    @FindBy(xpath = "//*[@class='datepicker__calendar datepicker__calendar--left']")
    protected WebElement dateCalendar;   

    @FindBy(xpath = "//*[@class='flight-search-widget__start-search ng-tns-c54-3 ry-button--gradient-yellow']")
    protected WebElement btnSearch;

    @FindBy(xpath = "//*[@data-id='2023-07-10']")
    protected WebElement dateFirstDate;

    @FindBy(xpath = "//*[@data-id='2023-08-30']")
    protected WebElement dateSecondDate;

    @FindBy(xpath = "//*[@class='counter__button-wrapper--enabled']")
    protected WebElement btnSelectAdults;

    @FindBy(xpath = "(//*[@class='counter__button-wrapper--enabled'])[4]")
    protected WebElement btnSelectChildren;

    @FindBy(xpath = "//*[@class='passengers__confirm-button ry-button--anchor-blue ry-button--anchor']")
    protected WebElement btnDone;

    @FindBy(xpath = "//*[@class='header__title title-m-lg title-m-sm ng-tns-c146-4']")
    protected WebElement lblDepartureDestination;

    @FindBy(xpath = "//*[text()=' Select ']")
    protected WebElement btnSelect;

    @FindBy(xpath = "//*[@data-e2e='change-flight-button']")
    protected WebElement btnEditFlight;

    @FindBy(xpath = "(//*[@class='_container fill-light-blue icon-16'])[2]")
    protected WebElement btnNextDates;

    @FindBy(xpath = "//*[@class='carousel__container ng-tns-c113-11 ng-trigger ng-trigger-listSlide']//descendant::button")
    protected List<WebElement> lblFlightDate;

    @FindBy(xpath = "//*[@class='item ng-tns-c113-10 ng-star-inserted']//descendant::button")
    protected List<WebElement> lblFlightDateTwo;

    @FindBy(xpath = "//*[@data-ref='2023-12-06']")
    protected WebElement btnNewDepartureDate;

    @FindBy(xpath = "//*[@data-ref='2023-12-12']")
    protected WebElement btnNewDestinationDate;

    @FindBy(xpath = "//*[@class='flight-card__date ng-tns-c142-20 ng-star-inserted']")
    protected WebElement lblFirstValidateDate;

    @FindBy(xpath = "//*[@class='flight-card__date ng-tns-c142-22 ng-star-inserted']")
    protected WebElement lblSecondValidateDate;

    @FindBy(xpath = "//*[@class='fare-card__button fare-card__price ry-button--outline-dark-blue']")
    protected WebElement btnContinueValue;

    @FindBy(xpath = "//*[@class='fare-upgrade-footer-continue_button ry-button--outline-light-blue ry-button--full']")
    protected WebElement btnContinueWithValueFare;

    @FindBy(xpath = "//*[@class='login-touchpoint__login-later title-m-lg title-m-sm']")
    protected WebElement btnLogLater;

    @FindBy(xpath = "(//*[@class='dropdown__toggle body-l-lg body-l-sm'])[1]")
    protected WebElement dropTitle;

    @FindBy(xpath = "(//*[@class='//*[@class='dropdown__toggle body-l-lg body-l-sm'])[2]")
    protected WebElement dropTitleSecond;

    @FindBy(xpath = "(//*[@class='dropdown-item__label body-l-lg body-l-sm'])[2]")
    protected WebElement firstTitle;

    @FindBy(xpath = "(//*[@class='dropdown-item__label body-l-lg body-l-sm'])[1]")
    protected WebElement secondTitle;

    @FindBy(id = "form.passengers.ADT-0.name")
    protected WebElement firstNameFirstPassanger;

    @FindBy(id = "form.passengers.ADT-0.surname")
    protected WebElement lastNameFirstPassanger;

    @FindBy(id = "form.passengers.ADT-1.name")
    protected WebElement firstNameSecondPassanger;

    @FindBy(id = "form.passengers.ADT-1.surname")
    protected WebElement lastNameSecondPassanger;

    @FindBy(id = "form.passengers.CHD-0.name")
    protected WebElement firstNameThirdPassanger;

    @FindBy(id = "form.passengers.CHD-0.surname")
    protected WebElement lastNameThirdPassanger;

    @FindBy(xpath = "//*[@class='continue-flow__button ng-tns-c119-17 ry-button--gradient-yellow']")
    protected WebElement btnContinue;


}
