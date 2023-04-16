package org.crudresource.chaining.com;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeleteCR extends BaseClass {

	@Test(dependsOnMethods = {"org.crudresource.chaining.com.CreateCR.createChangeRequest"})
	public void deleteChangeRequest() {
		
		Response resp = request.delete("change_request/"+Sys_id);

		resp.then().assertThat().statusLine("HTTP/1.1 204 No Content");
		resp.then().assertThat().statusCode(204);

		resp.prettyPrint();

	}

}
