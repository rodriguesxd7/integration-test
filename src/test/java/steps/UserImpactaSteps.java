package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.Dado;
import definition.UserImpacta;
import support.RESTSupport;

public class UserImpactaSteps {
    private String url = "";

    @When("^user clicks on find Agapitos button$")
    public void userClicksOnFindAgapitosButton() {
        RESTSupport.executeGet(url);
    }

    @Given("^user is on the Agapito Servers Page$")
    public void userIsOnTheAgapitoServersPage() {
        url = url;
    }

    @And("^user would like to see user with id \"([^\"]*)\"$")
    public void userWouldLikeToSeeUserWithId(String id) throws Throwable {
        url = url + "/" + id;
    }

    @Dado("^que o usuário esteja no site do Agapito$")
    public void queOUsuárioEstejaNoSiteDoAgapito() {
    }
}


