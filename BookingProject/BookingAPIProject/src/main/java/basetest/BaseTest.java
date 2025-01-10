package basetest;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class BaseTest {
    public static RequestSpecification request;
    public static RequestSpecification buildRequest() {
        request = new RequestSpecBuilder()
                //.addHeader("Authorization", "Bearer your_token_here")
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .build();
        return request;
    }
}
