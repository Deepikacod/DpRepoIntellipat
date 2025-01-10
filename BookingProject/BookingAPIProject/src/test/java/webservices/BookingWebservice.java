package webservices;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

/**
 * @author deepika
 */

public class BookingWebservice {

    public static Response executeBookingAPI(RequestSpecification request, String requestBody, String endPoint){
        return given().spec(request)
                .log().all()
                .contentType("application/json")
                .accept("application/json")
                .body(requestBody)
                .when().post(endPoint)
                .then().log().all()
                .assertThat().statusCode(200)
                .extract().response();
    }

}
