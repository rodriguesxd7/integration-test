package steps;
import com.jayway.restassured.response.Response;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import definition.User;
import org.junit.Assert;
import support.RESTSupport;

public class ProcessosSteps {


        @Given("^user would like to save a register$")
        public void userWouldLikeToSaveARegister() {
                User.clearFields();
        }

        @And("^user inform1 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoVaraWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);

        }

        @And("^user inform2 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoNumeroProcessoWithValueQual(String fields, String value) throws Throwable {
                User.addFields(fields, value);

        }

        @And("^user inform3 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoNaturezaWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform4 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoPartesWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform5 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoUrgenteWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform6 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoArbitramentoSWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform7 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoAssistenteSocialWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform8 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoDataEntradaWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform9 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoDataSaidaWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform10 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoDataAgendamentoWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);

        }

        @And("^user inform11 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoStatusWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user inform12 (.*) with value equal \"([^\"]*)\"$")
        public void userInformProcessoObservacaoWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @When("^user click on the save button process$")
        public void userClickOnTheSaveButtonProcessPost() {
                RESTSupport.executePost(User.getEndPoint(), User.getFields());
                User.setLastUser(RESTSupport.key("id").toString());
        }

        @Then("^user should see status code (\\d+)$")
        public void userShouldSeeStatusCodePost(int statusCode) {
                int response = RESTSupport.getResponseCode();
                Assert.assertEquals(statusCode, response);
        }


        @Given("^user would like to consult a process$")
        public void userWouldLikeToConsultAProcess() throws Throwable {

        }

        /*@And("^user inform the code of process 827$")
        public void userInformTheCodeOfProcess() throws Throwable {

        }*/

        @When("^user click on the button$")
        public void userClickOnTheButton() throws Throwable {
                RESTSupport.executeGet(User.getEndPoint() + User.getLastUser() + ".json");
        }

        @Then("^user will see the process$")
        public void userWillSeeTheProcess() throws Throwable {
                String result = RESTSupport.key("partes").toString();
                Assert.assertEquals("Fulano x Ciclano", result);
        }

        @Given("^user would like to change all the data of the process$")
        public void userWouldLikeToChangeAllTheDataOfTheProcess() {
                User.clearFields();
        }

        @And("^User inform1 (.*) with value equal \"([^\"]*)\"$")
        public void userInformVaraWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform2 (.*) with value equal \"([^\"]*)\"$")
        public void userInformNumero_processoWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform3 (.*) with value equal \"([^\"]*)\"$")
        public void userInformNaturezaWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform4 (.*) with value equal \"([^\"]*)\"$")
        public void userInformPartesWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform5 (.*) with value equal \"([^\"]*)\"$")
        public void userInformUrgenteWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform6 (.*) with value equal \"([^\"]*)\"$")
        public void userInformArbitramentoWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform7 (.*) with value equal \"([^\"]*)\"$")
        public void userInformAssistente_socialWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform8 (.*) with value equal \"([^\"]*)\"$")
        public void userInformData_entradaWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform9 (.*) with value equal \"([^\"]*)\"$")
        public void userInformData_saidaWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform10 (.*) with value equal \"([^\"]*)\"$")
        public void userInformData_agendamentoWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform11 (.*) with value equal \"([^\"]*)\"$")
        public void userInformStatusWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^User inform12 (.*) with value equal \"([^\"]*)\"$")
        public void userInformObservacaoWithValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @When("^User click on the save button process$")
        public void userClickOnTheSaveButtonProcessPut() {
                RESTSupport.executePut(User.getEndPoint() + User.getLastUser() + ".json",User.getFields());
        }

        @Then("^User should see status code (\\d+)$")
        public void userShouldSeeStatusCodePut(int arg0) {
                String result = RESTSupport.key("partes").toString();
                Assert.assertEquals("Lider1 x Lider2", result);
        }

        @Given("^user would like to change just one data of the process$")
        public void userWouldLikeToChangeJustOneDataOfTheProcess() {
                User.clearFields();
        }

        @And("^user inform4 (.*) with new value equal \"([^\"]*)\"$")
        public void userInformPartesWithNewValueEqual(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @When("^user click on the save button put$")
        public void userClickOnTheSaveButtonPut() {
                RESTSupport.executePatch(User.getEndPoint() + User.getLastUser() + ".json",User.getFields());
        }

        @Then("^user should see status code of put (\\d+)$")
        public void userShouldSeeStatusCodeOfPut(int arg0) {
                String result = RESTSupport.key("partes").toString();
                Assert.assertEquals("PS4 x XBOX", result);
        }

        @Given("^user would like to delete a process$")
        public void userWouldLikeToDeleteAProcess() {
                User.clearFields();
        }

        @When("^user click on the button to delete$")
        public void userClickOnTheButtonToDelete() {
                RESTSupport.executeDelete(User.getEndPoint() + User.getLastUser() + ".json");

        }

        @Then("^user should see a status code of delete (\\d+)$")
        public void userShouldSeeAStatusCodeOfDelete(int arg0) {
                RESTSupport.executeGet(User.getEndPoint() + User.getLastUser() + ".json");
        }
}
