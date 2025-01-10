package tests;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import payload.CreateBookingAPI;
import webservices.BookingWebservice;
import static org.testng.Assert.assertEquals;


public class BookingAPICall {

    String endPoint = "https://restful-booker.herokuapp.com/booking/";
    String cust_fname = "test1";
    String cust_lname = "test2";
    String total_price = "100";
    String deposit_paid = "true";
    String checkin_date = "2022-01-01";
    String checkout_date = "2024-01-01";
    String additional_needs = "test";
    String bookingID;

    @Test(priority = 1)
    //Customer Booking
    public void customerBooking() {

        System.out.println("Customer Booking API test is running.");

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json");

        String requestBody;
        requestBody = CreateBookingAPI.createBookingPayload(cust_fname,
                cust_lname,
                total_price,
                deposit_paid,
                checkin_date,
                checkout_date,
                additional_needs);

        Response bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);

        System.out.println("Create Booking Response is" + bookingResponse);

        if (bookingResponse.getStatusCode() == 200) {
            bookingID = bookingResponse.jsonPath().getString("bookingid");

            if (bookingID != null) {
                System.out.println("Booking created successfully. Booking ID: " + bookingID);
            } else {
                System.out.println("Booking ID was not found in the response.");
            }
        } else {
            System.out.println("Failed to create booking with Status Code: " + bookingResponse.getStatusCode());
            System.out.println("Response Body: " + bookingResponse.asString());
        }
    }

    @Test(priority = 2)
    public void bookingRetrival() {
        System.out.println(bookingID);

        String getBookingEndpoint = endPoint + bookingID;

        System.out.println(getBookingEndpoint);

        RequestSpecification request = RestAssured.given()
                .header("Content-Type", "application/json");

        Response getBookingResponse = request.get(getBookingEndpoint);

        System.out.println("Booking Retrieval Response: " + getBookingResponse.asString());

        if (getBookingResponse.getStatusCode() == 200) {
            System.out.println("Booking details retrieved successfully.");

            String firstName = getBookingResponse.jsonPath().getString("firstname");
            String lastName = getBookingResponse.jsonPath().getString("lastname");
            String totalprice = getBookingResponse.jsonPath().getString("totalprice");
            String depositpaid = getBookingResponse.jsonPath().getString("depositpaid");
            String checkin = getBookingResponse.jsonPath().getString("bookingdates.checkin");
            String checkout = getBookingResponse.jsonPath().getString("bookingdates.checkout");
            String additionalneeds = getBookingResponse.jsonPath().getString("additionalneeds");

            assertEquals(firstName, cust_fname, "First name does not match!");
            assertEquals(lastName, cust_lname, "Last name does not match!");
            assertEquals(totalprice, total_price, "Total price does not match!");
            assertEquals(depositpaid, deposit_paid, "Deposit paid does not match!");
            assertEquals(checkin, checkin_date, "Check-in date does not match!");
            assertEquals(checkout, checkout_date, "Check-out date does not match!");
            assertEquals(additionalneeds, additional_needs, "Additional needs does not match!");

            System.out.println("Booking details retrieved and verified successfully.");

        } else {
            System.out.println("Failed to retrieve booking. Status Code: " + getBookingResponse.getStatusCode());
        }
    }
/*
    @Test(priority = 3)
    public void customerBooking_NegativeScenarios() {
        System.out.println("Running negative test cases for Booking API.");
        RequestSpecification request;
        String requestBody;
        Response bookingResponse;

        // Scenario 1: Missing First Name
        System.out.println("Testing Missing First Name...");
        request = RestAssured.given().header("Content-Type", "application/json");
        requestBody = CreateBookingAPI.createBookingPayload("", cust_lname, total_price, deposit_paid, checkin_date, checkout_date, additional_needs);
        bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);
        assertEquals(400, bookingResponse.getStatusCode());  // Expected 400 Bad Request
        System.out.println("Missing First Name response: " + bookingResponse.getStatusCode());

        // Scenario 2: Missing Last Name
        System.out.println("Testing Missing Last Name...");
        requestBody = CreateBookingAPI.createBookingPayload(cust_fname, null, total_price, deposit_paid, checkin_date, checkout_date, additional_needs);
        bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);
        assertEquals(400, bookingResponse.getStatusCode());  // Expected 400 Bad Request
        System.out.println("Missing Last Name response: " + bookingResponse.getStatusCode());

        // Scenario 3: Negative Total Price
        System.out.println("Testing Negative Total Price...");
        requestBody = CreateBookingAPI.createBookingPayload(cust_fname, cust_lname, String.valueOf(-100.0), deposit_paid, checkin_date, checkout_date, additional_needs);
        bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);
        assertEquals(400, bookingResponse.getStatusCode());  // Expected 400 Bad Request
        System.out.println("Negative Total Price response: " + bookingResponse.getStatusCode());

        // Scenario 4: Invalid Deposit Paid Value
        System.out.println("Testing Invalid Deposit Paid Value...");
        requestBody = CreateBookingAPI.createBookingPayload(cust_fname, cust_lname, total_price, "yes", checkin_date, checkout_date, additional_needs);
        bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);
        assertEquals(400, bookingResponse.getStatusCode());  // Expected 400 Bad Request
        System.out.println("Invalid Deposit Paid response: " + bookingResponse.getStatusCode());

        // Scenario 5: Invalid Check-in Date Format
        System.out.println("Testing Invalid Check-in Date Format...");
        requestBody = CreateBookingAPI.createBookingPayload(cust_fname, cust_lname, total_price, deposit_paid, "2025-99-99", checkout_date, additional_needs);
        bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);
        assertEquals(400, bookingResponse.getStatusCode());  // Expected 400 Bad Request
        System.out.println("Invalid Check-in Date Format response: " + bookingResponse.getStatusCode());

        // Scenario 6: Check-out Date Before Check-in Date
        System.out.println("Testing Check-out Date Before Check-in Date...");
        requestBody = CreateBookingAPI.createBookingPayload(cust_fname, cust_lname, total_price, deposit_paid, "2025-01-10", "2025-01-05", additional_needs);
        bookingResponse = BookingWebservice.executeBookingAPI(request, requestBody, endPoint);
        assertEquals(400, bookingResponse.getStatusCode());  // Expected 400 Bad Request
        System.out.println("Check-out Date Before Check-in Date response: " + bookingResponse.getStatusCode());

    }
 */
}







