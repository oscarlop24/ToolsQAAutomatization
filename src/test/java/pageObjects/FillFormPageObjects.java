package pageObjects;

import definitions.Hooks;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FillFormPageObjects extends WebBasePage {
    @FindBy(xpath = "//div[text()=\"Practice Form\"]")
    private WebElement viewTitle;

    @FindBy(id = "firstName")
    private WebElement inputFirsName;

    @FindBy(id = "lastName")
    private WebElement inputLastName;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;

    @FindBy(xpath = "//label[@for=\"gender-radio-1\"]")
    private WebElement selectGender;

    @FindBy(id = "userNumber")
    private WebElement inputPhoneNumber;

    @FindBy(id = "dateOfBirthInput")
    private WebElement selectDate;

    @FindBy(xpath = "//option[text()=\"February\"]")
    private WebElement inputMonth;

    @FindBy(xpath = "//option[text()=\"1995\"]")
    private WebElement inputDay;

    @FindBy(id = "subjectsInput")
    private WebElement inputSubjects;

    @FindBy(xpath = "//label[text()=\"Music\"]")
    private WebElement selectHobbie;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    private WebElement inputAddress;

    @FindBy(xpath = "//div[contains(@class,'indicatorContainer')]")
    private WebElement selectState;

    public void enterPageDemoqa() {
        Hooks.getDriver().get("https://demoqa.com/automation-practice-form");
    }


    public void sendKeysFirstName(String name) {
        inputFirsName.sendKeys(name);
    }

    public void sendKeysLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public boolean validateEnterPage() {
        waitUntilElementIsVisibleNonThrow(viewTitle, 5);
        return isVisible(viewTitle);
    }

    public void sendKeysEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void clickRadioGender() {
        selectGender.click();
    }

    public void sendKeysPhoneNumber(String phone) {
        inputPhoneNumber.sendKeys(phone);
        inputPhoneNumber.sendKeys(Keys.TAB);
    }

    public void sendKeysDate(String date) {
        selectDate.sendKeys(date);
        selectDate.sendKeys(Keys.ENTER);
    }

    public void sendKeysSubject(String subject, String subject2) {
        inputSubjects.sendKeys(subject);
        inputSubjects.sendKeys(Keys.ENTER);
        inputSubjects.sendKeys(subject2);
        inputSubjects.sendKeys(Keys.ENTER);
    }

    public void clickCheckBoxHobbie() {
        JavascriptExecutor executor = (JavascriptExecutor)Hooks.getDriver();
        executor.executeScript("window.scrollBy(0,1000)");
        waitUntilElementIsVisible(selectHobbie, 5);
        selectHobbie.click();
    }

    public void uploadPictureField(String picture) {
        uploadPicture.sendKeys(picture);
    }

    public void sendKeysAddress(String address) {
        JavascriptExecutor executor = (JavascriptExecutor)Hooks.getDriver();
        executor.executeScript("document.body.style.zoom = '0.7'");
        inputAddress.sendKeys(address);
        inputAddress.sendKeys(Keys.TAB, "NCR");
    }

    public void selectOptionState() {
        //selectState.click();
    }
}
