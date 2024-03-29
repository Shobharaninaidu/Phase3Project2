package crudOperations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteUser {

	@Test
	public void DelUser() {

		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification request = RestAssured.given();
		Response response = request.delete("/api/users/2");
		System.out.println("The response code is " + response.getStatusCode());

		System.out.println("The response body is " + response.body().asString());
		Assert.assertEquals(response.getStatusCode(), 204);
	}
}
