package org.crudresource.chaining.com;

import org.testng.annotations.Test;

public class CreateCR extends BaseClass{
	
	@Test
	public void createChangeRequest() {
		resp = request.post("change_request");
		String Sys_id = resp.jsonPath().get("result.sys_id");
		
		System.out.println("Sys id value is : "+Sys_id);
		resp.then().assertThat().statusCode(201).log().all();

	}

}
