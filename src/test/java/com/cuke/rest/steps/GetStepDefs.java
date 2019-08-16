package com.cuke.rest.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetStepDefs{

    @Given("^End point is configured$")
    public void end_point_is_configured(){
    }

    @When("^I request all users$")
    public void i_request_all_users() {
    }

    @Then("^I should get status code (\\d+)$")
    public void i_should_get_status_code(int statusCode){
    }

    @Then("^I should get all users$")
    public void i_should_get_all_users(){
    }

}
