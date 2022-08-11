package Admin;

import org.junit.jupiter.api.Test;

import static Admin.Vehicle.StringAlpha;
import static Admin.Vehicle.StringNumer;
import static org.junit.jupiter.api.Assertions.*;

class ParkingTest {

    @Test
    void setupSlot() {
        Parking p = new Parking();
        p.setupSlot(10, 10);
        assertEquals(100, p.getCapacity());
    }

    @Test
    void loadUsedSlot() {
        Parking p = new Parking();
        Vehicle v = new Vehicle();
        p.assignVehicleToSlot(v);
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        p.loadUsedSlot();
        assertEquals(1, p.getUsedSlot());
    }

    @Test
    void getMaxRow() {
        Parking p = new Parking();
        p.setupSlot(10, 10);
        assertEquals(10, p.getMaxRow());
    }

    @Test
    void getMaxColumn() {
        Parking p = new Parking();
        p.setupSlot(10, 10);
        assertEquals(10, p.getMaxColumn());

    }

    @Test
    void getUsedSlot() {
        Parking p = new Parking();
        Vehicle v = new Vehicle();
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        p.assignVehicleToSlot(v);

        p.loadUsedSlot();
        assertEquals(1, p.getUsedSlot());
    }

    @Test
    void getCapacity() {
        Parking p = new Parking();
        p.setupSlot(10, 10);
        assertEquals(100, p.getCapacity());
    }

    @Test
    void getRemainingSlot() {
        Parking p = new Parking();
        for(int i = 0; i < 10; i++) {
            Vehicle v = new Vehicle();
            v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
            p.assignVehicleToSlot(v);
        }
        assertEquals(90, p.getRemainingSlot());
    }

    @Test
    void getSlot() {
        Parking p = new Parking();
        assertEquals(2, p.getSlot(1, 2).getSlotNumber());
    }

    @Test
    void getListCurrentVehicle() {
        Parking p = new Parking();
        Vehicle v = new Vehicle();
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        p.assignVehicleToSlot(v);
        p.loadUsedSlot();
        assertEquals(1, p.getListCurrentVehicle().size());
    }

    @Test
    void addVehicleToCurrentVehicle() {
        Parking p = new Parking();
        Vehicle v = new Vehicle();
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        p.assignVehicleToSlot(v);
        p.loadUsedSlot();
        assertEquals(1, p.getListCurrentVehicle().size());
    }



    @Test
    void assignVehicleToSlot() {
        Parking p = new Parking();
        Vehicle v = new Vehicle();
        v.setLicPlate("29" + StringAlpha(1) + StringNumer(5));
        p.assignVehicleToSlot(v);
        p.loadUsedSlot();
        assertEquals(1, p.getListCurrentVehicle().size());
    }

}