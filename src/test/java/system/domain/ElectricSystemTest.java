package system.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElectricSystemTest {

    //CP1: Si tenemos una red con un dispositivo, la cantidad de dispositivos de esa red es 1.
    @Test
    public void Given_A_ElectricSystem_With_One_Device_When_NumberOfDevices_Method_Is_Called_Then_Return_One() {
        //Given
        ElectricSystem electricSystem = new ElectricSystem();
        Device device = new Device(30);
        electricSystem.addDevice(device);

        //Then
        assertEquals(1, electricSystem.numberOfDevices());
    }

}