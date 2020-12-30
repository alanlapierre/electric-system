package system.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class ElectricSystemTest {


   private static Device turnedOnDevice1;
   private static Integer turnedOnDevice1Consumption;

   private static Device turnedOnDevice2;
   private static Integer turnedOnDevice2Consumption;

   private static Device turnedOffDevice;
   private static Integer turnedOffDeviceConsumption;

    @BeforeAll
    public static void beforeAllTests() {

        turnedOnDevice1Consumption = 30;
        turnedOnDevice1 = Mockito.mock(Device.class);
        when(turnedOnDevice1.getCurrentConsumption()).thenReturn(turnedOnDevice1Consumption);

        turnedOnDevice2Consumption = 50;
        turnedOnDevice2 = Mockito.mock(Device.class);
        when(turnedOnDevice2.getCurrentConsumption()).thenReturn(turnedOnDevice2Consumption);

        turnedOffDeviceConsumption = 0;
        turnedOffDevice = Mockito.mock(Device.class);
        when(turnedOffDevice.getCurrentConsumption()).thenReturn(turnedOffDeviceConsumption);
    }


    //CP1: Si tenemos una red con un dispositivo, la cantidad de dispositivos de esa red es 1.
    @Test
    public void Given_A_ElectricSystem_With_One_Device_When_NumberOfDevices_Method_Is_Called_Then_Return_One() {
        //Given
        ElectricSystem electricSystem = new ElectricSystem();
        electricSystem.addDevice(turnedOffDevice);

        //Then
        assertEquals(1, electricSystem.numberOfDevices());
    }

    //CP2: Si tenemos una red con un dispositivo encendido, el consumo
    // actual de la red es el consumo de dicho dispositivo cuando se encuentra encendido.
    @Test
    public void Given_A_ElectricalSystem_With_One_Device_TurnedOn_When_GetCurrentConsumption_Method_Is_Called_Then_Return_30() {
        //Given
        ElectricSystem electricSystem = new ElectricSystem();
        electricSystem.addDevice(turnedOnDevice1);
        Integer expectedConsumption = turnedOnDevice1Consumption;

        //When
        Integer result = electricSystem.getCurrentConsumption();

        //Then
        assertEquals(expectedConsumption, result);
    }

    //CP3: Si tenemos una red con dos dispositivos encendido, el consumo
    // actual de la red es la suma de los consumos de los dispositivos cuando se encuentran encendidos.
    @Test
    public void Given_A_ElectricalSystem_With_Two_Devices_TurnedOn_When_GetCurrentConsumption_Method_Is_Called_Then_Return_80() {
        //Given
        ElectricSystem electricSystem = new ElectricSystem();
        electricSystem.addDevice(turnedOnDevice1);
        electricSystem.addDevice(turnedOnDevice2);
        Integer expectedConsumption = turnedOnDevice1Consumption + turnedOnDevice2Consumption;

        //When
        Integer result = electricSystem.getCurrentConsumption();

        //Then
        assertEquals(expectedConsumption, result);
    }


    //CP4: Si tenemos una red con dos dispositivos, uno encendido y el otro apagado, el consumo
    // actual de la red es el consumo del dispositivo que se encuentra encendido.
    @Test
    public void Given_A_ElectricalSystem_With_One_Device_TurnedOn_And_One_Device_TurnedOff_When_GetCurrentConsumption_Method_Is_Called_Then_Return_30() {
        //Given
        ElectricSystem electricSystem = new ElectricSystem();
        electricSystem.addDevice(turnedOnDevice1);
        electricSystem.addDevice(turnedOffDevice);
        Integer expectedConsumption = turnedOnDevice1Consumption;

        //When
        Integer result = electricSystem.getCurrentConsumption();

        //Then
        assertEquals(expectedConsumption, result);
    }

}