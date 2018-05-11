package rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.*;
import static io.restassured.RestAssured.*;

public class AllEmployeeTest {

    @Test
    public void callEmployeeResource(){
        Response response = given().when().get ("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").then ().statusCode ( 200 ).extract ().response ();
        String status = response.getStatusLine ();
        int statusCode = response.getStatusCode ();
        String body = response.getBody ().print ();
        Assert.assertEquals ( status , "HTTP/1.1 200 OK" );
        Assert.assertEquals ( statusCode , 200 );
    }
}
