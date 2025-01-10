package payload;

public class CreateBookingAPI {
    String cust_fname;
    String cust_lname;
    String total_price;
    String deposit_paid;
    String checkin_date;
    String checkout_date;
    String additional_needs;

public static String createBookingPayload(String cust_fname,
                                          String cust_lname,
                                          String total_price,
                                          String deposit_paid,
                                          String checkin_date,
                                          String checkout_date,
                                          String additional_needs)
    {
        return "{\r\n"
        + "   \"firstname\":\""+cust_fname+"\",\r\n"
                + "   \"lastname\":\""+cust_lname+"\",\r\n"
                + "   \"totalprice\":\""+total_price+"\",\r\n"
                + "   \"depositpaid\":\""+deposit_paid+"\",\r\n"
                + "   \"bookingdates\":{\r\n"
                + "   \"checkin\":\""+checkin_date+"\",\r\n"
                + "   \"checkout\":\""+checkout_date+"\"\r\n"
                + "   },\r\n"
                + "   \"additionalneeds\":\""+additional_needs+"\"\r\n"
                + "}";
    }
}


