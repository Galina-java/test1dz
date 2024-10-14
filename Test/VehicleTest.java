import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    @Test
    void carShouldBeInstanceOfVehicle() {
        Car car = new Car("Toyota", "Corolla", 2021);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void motorcycleShouldBeInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    void carShouldHaveFourWheels() {
        Car car = new Car("Toyota", "Corolla", 2021);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motorcycleShouldHaveTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void carShouldReachSpeedOf60InTestDrive() {
        Car car = new Car("Toyota", "Corolla", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void motorcycleShouldReachSpeedOf75InTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void carShouldStopWhenParkedAfterTestDrive() {
        Car car = new Car("Toyota", "Corolla", 2021);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleShouldStopWhenParkedAfterTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
