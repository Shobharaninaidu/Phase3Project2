package crudOperations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetListofUsers {

	@Test

	public void GetListUsers() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";

		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.body().asString();
		System.out.println(responseBody);
		System.out.println("Response code is : " + response.statusCode());
		Assert.assertEquals(response.statusCode(), 200);

	}
}
