package org.crudresource.chaining.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	static RequestSpecification request;
	static String Sys_id;
	static Response resp;
	@BeforeMethod
	public void setUp() {
		RestAssured.baseURI = "https://dev60053.service-now.com/api/now/table";

		RestAssured.authentication = RestAssured.basic("admin", "Ii=%rL2wPzQ3");
		 request = RestAssured.given().contentType(ContentType.JSON).body("{\r\n"
					+ "    \"short_description\": \"Success\",\r\n"
					+ "    \"description\": \"Creating CR for practicing in rest assured automation\"\r\n"
					+ "}").log().all();
		
		}
	
	@AfterMethod
	public void tearDown() {
		resp.then().log().all();
	}

}
