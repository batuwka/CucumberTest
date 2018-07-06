package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

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
        RestAssured.baseURI = "https://api.github.com/";
        RequestSpecification httpReq = RestAssured.given();
        Response response = httpReq.get("users/batuwka");

        ResponseBody body = response.getBody();

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(body.prettyPrint());
        System.out.println("");
        System.out.println("");
        System.out.println("");
//        InputStream xsd = Thread.currentThread().getContextClassLoader().getResourceAsStream("schemas/mainPage.xsd");
//        when().get(RestAssured.baseURI + "/complete").then().statusCode(Integer.parseInt(arg0)).body(matchesXsd(xsd));
        get("users/batuwka").then().body("public_gists", equalTo(1));
    }
}
