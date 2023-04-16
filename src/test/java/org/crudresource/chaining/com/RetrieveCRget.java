package org.crudresource.chaining.com;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RetrieveCRget extends BaseClass {

	@Test(dependsOnMethods = {"org.crudresource.chaining.com.CreateCR.createChangeRequest"})
	public void retrieveChangeRequest() {
		Response resp = request.get("change_request/"+Sys_id);
		resp.then().assertThat().statusCode(200);
		//resp.prettyPrint();

	}

}
