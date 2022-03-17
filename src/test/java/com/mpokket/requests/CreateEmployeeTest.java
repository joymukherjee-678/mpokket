package com.mpokket.requests;

import org.testng.annotations.Test;

import com.mokket.pojos.EmployeePojo;
import com.mpokket.util.BaseTest;
import com.mpokket.util.EndPoint;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;

public class CreateEmployeeTest extends BaseTest {
	
	@Test
	public void createEmployeeTest() {
		
		EmployeePojo createEmployeePOJO = new EmployeePojo("test", "123", "23");
		
		Response createEmployeeResponse = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(createEmployeePOJO, ObjectMapperType.JACKSON_1)
		.when()
		.post(EndPoint.CREATE_EMPLOYEE);
		createEmployeeResponse.then()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON)
		.log().all();		
	}	

}
