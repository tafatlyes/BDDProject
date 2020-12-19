package com.pnt.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class ApiPractice2 {


     /*
    There are following public apis
#	Route	        Method  Type	                    Full route	                                Description	Details
1	/list of users   	    GET	    JSON	https://reqres.in/api/users?page=2                  Get list of users data Details
2	/user/{id}	            GET	    JSON    https://reqres.in/api/users/2	                    Get a specific user data Details
3   /user/{id}	            GET	    JSON    https://reqres.in/api/users/23	                    single user data not found
4	/create	user            POST	JSON	https://reqres.in/api/create/users               	Create new user in database Details
5	/update/{id}	        PUT	    JSON	https://reqres.in/api/users/update/{id}	            Update an employee record Details
6	/delete/{id}	        DELETE	JSON	https://reqres.in/api/users/delete/{id}	             Delete a user record Details
*/

    public String baseURI = RestAssured.baseURI = "https://reqres.in/api/";

    private String usersPageEndpoint = "users?page=";
    private String usersEndpoint     = "users/";
    private String createEndpoint    = "create/";
    private String updateEndpoint    = "update/";
    private String deleteEndpoint    = "delete/";



    @Test
    public void getAllEmployees() {
        Response response = RestAssured.given().when().get(usersPageEndpoint + 2).then()
                .assertThat().statusCode(200).extract().response();
        System.out.println(response.asString());
        System.out.println(response.getStatusCode());

        JSONObject js = new JSONObject(response.asString());
        System.out.println(js.get("data"));

        JSONArray jsonArray = js.optJSONArray("data");
        System.out.println(jsonArray);

        JSONObject js1 = (JSONObject) jsonArray.get(1);
        System.out.println(js1.get("first_name"));



        //this method is used when we have one object { one body}  and want to print any string on it
//        String response = RestAssured.given().when().get(usersPageEndpoint + 2).then()
//                .assertThat().statusCode(200).extract().response().asString();
//        System.out.println(response);
//
//        JsonPath jp = new JsonPath(response);
//        String emailId = jp.getString("email");

    }



}


