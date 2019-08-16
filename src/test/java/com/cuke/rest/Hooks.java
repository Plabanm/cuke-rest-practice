package com.cuke.rest;

import cucumber.api.java.Before;
import io.restassured.RestAssured;

public class Hooks {

    @Before
    public void setUp(){
        RestAssured.baseURI = "";
        //RestAssured.port = ;
        RestAssured.basePath = "";

    }
}
