package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SubscriptionSD {

    @Given("I am on subscription page")
    public void iAmOnSubscriptionPage() {

        System.out.println("I am on subscription page");
    }

  /*  @And("I click on subscribe button")
    public void iClickOnSubscribeButton() {
        System.out.println("I click on subscribe button");
    }

    @Then("user should be subscribe")
    public void userShouldBeSubscribe() {
        System.out.println("user should be subscribe");
    }
*/
    @When("^I enter (.+) , (.+) and (.+)$")
    public void iEnterNamePhoneAndEmail(String name,String phone,String email) {

        System.out.println("name:"+name);
        System.out.println("phone:"+phone);
        System.out.println("email:"+email);
    }
}
