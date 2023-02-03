package definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.FillFormSteps;

public class FillFormDefinitions {
    @Steps
    FillFormSteps fillFormSteps;

    public FillFormDefinitions() {
        this.fillFormSteps = new FillFormSteps();
    }

    @Given("^se ingrese a la pagina donde se encuentra el formulario$")
    public void ingresarDemoqa(){
        fillFormSteps.enterFormToolsQaPage();
    }
    @When("^se llenen todos los campos del formulario (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
    public void llenarCamposDelFormulario(String name, String lastName, String email, String phone, String date, String subject, String subject2,
                                          String address){
        fillFormSteps.fillFormFields(name, lastName, email, phone, date, subject, subject2, address);
    }
}
