package org.crudresource.chaining.com;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class UpdateCRput extends BaseClass {

	@Test(dependsOnMethods = "org.crudresource.chaining.com.CreateCR.createChangeRequest")
	public void updateChangeRequest() {

		Response resp = request.body("{\r\n"
				+ "    \"short_description\": \"Successfully updated the existing body\",\r\n"
				+ "    \"description\": \"Updating CR for practicing in rest assured automation\"\r\n"
				+ "}").put("change_request/"+Sys_id);
		resp.then().assertThat().statusCode(200).body("result.short_description", Matchers.startsWith("Successfully updated"));
		
		//resp.prettyPrint();
	}
}
