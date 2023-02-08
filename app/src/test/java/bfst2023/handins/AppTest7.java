package bfst2023.handins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import bfst2023.handins.model.Address;

class AppTest7 {
    @Test void simple() {
        var addr = Address.parse("Finsensvej 50, 2000 Frederiksberg");
        assertEquals("Finsensvej", addr.street);
        assertEquals("50", addr.house);
        assertEquals("2000", addr.postcode);
        assertEquals("Frederiksberg", addr.city);
    }
    @Test void simplecomma() {
        // var addr = Address.parse("Finsensvej 50,,,, 2000 Frederiksberg");
        // assertEquals("Finsensvej", addr.street);
        // assertEquals("50", addr.house);
        // assertEquals("2000", addr.postcode);
        // assertEquals("Frederiksberg", addr.city);
    }
    @Test void simplespaces() {
        // var addr = Address.parse("Finsensvej        50, 2000 Frederiksberg");
        // assertEquals("Finsensvej", addr.street);
        // assertEquals("50", addr.house);
        // assertEquals("2000", addr.postcode);
        // assertEquals("Frederiksberg", addr.city);
    }
}
