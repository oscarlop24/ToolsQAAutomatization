package steps;

import definitions.Hooks;
import org.junit.Assert;
import pageObjects.FillFormPageObjects;
import pageObjects.WebBasePage;

import java.io.File;


public class FillFormSteps {
    FillFormPageObjects fillFormPageObjects;

    public FillFormSteps() {
        this.fillFormPageObjects = new FillFormPageObjects();
        fillFormPageObjects.setDriver(Hooks.getDriver());
    }

    public void enterFormToolsQaPage() {
        fillFormPageObjects.enterPageDemoqa();
        Assert.assertTrue("No se pudo ingresar a la página",fillFormPageObjects.validateEnterPage());
    }

    public void fillFormFields(String name, String lastName, String email, String phone, String date, String subject, String subject2,
                               String address) {
        File file = new File("src/test/resources/files/moto 1.jpg");
String path = file.getAbsolutePath();
        fillFormPageObjects.sendKeysFirstName(name);
        fillFormPageObjects.sendKeysLastName(lastName);
        fillFormPageObjects.sendKeysEmail(email);
        fillFormPageObjects.clickRadioGender();
        fillFormPageObjects.sendKeysPhoneNumber(phone);
        fillFormPageObjects.sendKeysDate(date);
        fillFormPageObjects.sendKeysSubject(subject, subject2);
        fillFormPageObjects.clickCheckBoxHobbie();
        fillFormPageObjects.uploadPictureField(path);
        fillFormPageObjects.waiting(5);
        fillFormPageObjects.sendKeysAddress(address);
        fillFormPageObjects.selectOptionState();
    }
}
