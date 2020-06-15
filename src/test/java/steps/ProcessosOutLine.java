package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import definition.User;
import org.junit.Assert;
import support.RESTSupport;

public class ProcessosOutLine {

        @Given("^user would like to save a register outline$")
        public void userWouldLikeToSaveARegister() {
            User.clearFields();
    }

        @And("^user post inform1 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInformWith(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }

        @And("^user post inform2 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform2(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }
        @And("^user post inform3 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform3(String fields, String value) throws Throwable {
                User.addFields(fields, value);
        }
        @And("^user post inform4 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform4(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform5 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform5(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform6 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform6(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform7 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform7(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform8 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform8(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform9 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform9(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform10 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform10(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform11 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform11(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }

        @And("^user post inform12 ([^\"]*) with value equal \"([^\"]*)\"$")
        public void userPostInform12(String fields, String value) throws Throwable {
            User.addFields(fields, value);
        }
        @When("^user click on the save button post process outline$")
        public void userClickOnPost() {
                RESTSupport.executePost(User.getEndPoint(), User.getFields());
                User.setLastUser(RESTSupport.key("id").toString());
        }

        @Then("^user should see status code post ([^\"]*)$")
        public void userShouldSeeStatusPost(int statusCode) {
            int response = RESTSupport.getResponseCode();
            Assert.assertEquals(statusCode, response);
        }

        @And("^user would like get the response$")
        public void userWouldLikeGet() {
            RESTSupport.executeGet(User.getEndPoint() + User.getLastUser() + ".json");
        }

}
