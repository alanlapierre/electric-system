package system.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    private static Device device;

    @BeforeAll
    public static void beforeAllTests() {
        device = new Device();

    }

    //CP1: Cuando indicamos que un dispositivo se enciende, el dispositivo debe quedar encendido.
    @Test
    public void Given_A_Device_When_TurnOn_Method_Is_Called_Then_The_Device_Is_TurnOn() {
        //When
        device.turnOn();

        //Then
        assertTrue(device.getTurnedOn());
    }

    //CP2: Cuando indicamos que un dispositivo se debe apagar, el dispositivo debe quedar apagado.
    @Test
    public void Given_A_Device_When_TurnOff_Method_Is_Called_Then_The_Device_Is_TurnOff() {
        //When
        device.turnOff();

        //Then
        assertFalse(device.getTurnedOn());
    }

}