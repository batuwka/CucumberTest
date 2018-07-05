package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class Steps{

    @Given("^given$")
    public void given1() {
//        System.out.println("given");
    }

    @When("^when$")
    public void when2() {
//        System.out.println("when");
    }

    @Then("^then$")
    public void then3() {
        int code = given().when().get("http://www.google.com").statusCode();//then().statusCode(200);
        Assert.assertEquals(code, 201);
    }

    @Then("^I should see \"([^\"]*)\" status code$")
    public void iShouldSeeStatusCode(String arg0) {
        int code = given().when().get("http://www.google.com").statusCode();//then().statusCode(200);
        Assert.assertEquals(code, Integer.parseInt(arg0));
    }
}
