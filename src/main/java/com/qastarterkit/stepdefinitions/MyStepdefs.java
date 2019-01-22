package com.qastarterkit.stepdefinitions;

import com.qastarterkit.model.SelectUrl;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import static io.restassured.RestAssured.*;

import java.net.URI;

public class MyStepdefs {


    Response response;

    @Given("^I have logged into my application or I have set up test region$")
    public void iHaveLoggedIntoMyApplciationOrIHaveSetUpTestRegion() {

        //Write code for any set required for the test to run
    }

    @Given("^I got all details required to call rest service$")
    public void iGotAllDetailsRequiredToCallRestService() {
        // I am reading the url based on java argument or reading default url (url1) if no arguments are passsed

        System.out.println("URL selected for the test us " + SelectUrl.url);

    }

    @When("^I will call the rest URL$")
    public void iWillCallTheRestURL() {

        URI uri = URI.create(SelectUrl.url);
         response = given().when().get(uri);

    }

    @Then("^Call should be successful and response body should have valid data$")
    public void callShouldBeSuccessfulAndResponseBodyShouldHaveValidData() {
        response.getBody().prettyPrint();

        //You can parse through the response and write your validations here using JUNIT like below
        //Assert.assertEquals("validation json reponse","actual value", "expected value");

    }

    @Then("^Call should be successful and 200 response code should be returned$")
    public void callShouldBeSuccessfulAndResponseCodeShouldBeReturned() {
       //validates the response code
        response.then().statusCode(200);
    }
}
