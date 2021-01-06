package system.domain.device;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriticalDeviceTest {

    private static Device device;
    private static Integer consumption;

    @BeforeAll
    public static void beforeAllTests() {
        //Creating a CriticalDevice.
        consumption = 30;
        device = new CriticalDevice("TV1", consumption);
    }

    //CP1: Cuando enviamos una petición de apagado, el dispositivo critico NO DEBE apagarse.
    @Test
    public void Given_A_TurnedOn_Device_When_TurnOffRequest_Method_Is_Called_Then_The_Critical_Device_Isnt_TurnOff(){
        //Given
        device.turnOn();

        //When
        device.turnOffRequest();

        //Then
        assertTrue(device.getTurnedOn());
    }


}