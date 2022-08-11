package Admin;

import org.junit.jupiter.api.Test;

import static Admin.Vehicle.StringAlpha;
import static Admin.Vehicle.StringNumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        Vehicle v = new Vehicle();

    }
    Boolean patternMatch(String s){
        Pattern pattern = Pattern.compile("29[a-zA-Z]+[0-9]{5}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    @Test
    void setLicPlate() {
        //License Plate Checking
        Vehicle v = new Vehicle();
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        assertTrue(patternMatch(v.getLicPlate()));
    }


    @Test
    void setTicket() {
        //Ticket Checking
        Parking p = new Parking();
        Ticket ticket = new Ticket(new Vehicle(), p.getSlot(1,2));
        Vehicle v = new Vehicle();
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        v.setTicket(ticket);
        assertEquals(ticket, v.getTicket());
    }


    Boolean patternMatch2(String s){
        Pattern pattern = Pattern.compile("[a-zA-Z]{7}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    @Test
    void stringAlpha() {
        //String Generator Checking
        String test = Vehicle.StringAlpha(7);
        assertTrue(patternMatch2(test));

    }
    Boolean patternMatch3(String s){
        Pattern pattern = Pattern.compile("[0-9]{7}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    @Test
    void stringNumer() {
        //Check generate correct string number
        String test = Vehicle.StringNumer(7);
        assertTrue(patternMatch3(test));
    }
}