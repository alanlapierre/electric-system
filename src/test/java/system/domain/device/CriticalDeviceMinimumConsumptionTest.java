package system.domain.device;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriticalDeviceMinimumConsumptionTest {

    private static Device device;
    private static Integer consumption;
    private static Integer minimunConsumption;

    @BeforeAll
    public static void beforeAllTests() {
        //Creating a CriticalDevice with Minimun Consumption.
        consumption = 30;
        minimunConsumption = 3;
        device = new CriticalDeviceMinimumConsumption("TV1", consumption, minimunConsumption);
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

    //CP3: Cuando creamos un dispositivo con determinado consumo, el consumo debe ser establecido en forma correcta.
    @Test
    public void Given_A_Device_Created_With_A_Consumption_When_GetConsumption_Method_Is_Called_Then_Return_Consumption() {
        //Given
        Integer expectedConsumption = this.consumption;

        //When
        Integer result =device.getConsumption();

        //Then
        assertEquals(expectedConsumption,result);
    }

    //CP4: Cuando tenemos un dispositivo encendido, el consumo actual debe ser el consumo con el cual fue creado dicho dispositivo.
    @Test
    public void Given_A_TurnedOn_Device_When_GetCurrentConsumption_Method_Is_Called_Then_Return_Consumption(){
        //Given
        Integer expectedCurrentConsumption = this.consumption;
        device.turnOn();

        //When
        Integer result = device.getCurrentConsumption();

        //Then
        assertEquals(expectedCurrentConsumption,result);
    }


    //CP5: Cuando tenemos un dispositivo apagado, el consumo actual debe ser cero.
    @Test
    public void Given_A_TurnedOff_Device_When_GetCurrentConsumption_Method_Is_Called_Then_Return_Zero(){
        //Given
        Integer expectedCurrentConsumption = 0;
        device.turnOff();

        //When
        Integer result = device.getCurrentConsumption();

        //Then
        assertEquals(expectedCurrentConsumption,result);
    }


    //CP6: Cuando enviamos una petición de apagado, el dispositivo critico NO DEBE apagarse.
    @Test
    public void Given_A_TurnedOn_Device_When_TurnOffRequest_Method_Is_Called_Then_The_Critical_Device_Isnt_TurnOff(){
        //Given
        device.turnOn();

        //When
        device.turnOffRequest();

        //Then
        assertTrue(device.getTurnedOn());
    }


    //CP7: Cuando hacemos una solicitud de apagado a un dispositivo encendido, el consumo actual debe ser el consumo minimo de dicho dispositivo.
    @Test
    public void Given_A_TurnedOn_Device_When_TurnOffRequest_Method_Is_Called_Then_Current_Consumption_Is_Now_Minimun_Consumption(){
        //Given
        Integer expectedCurrentConsumption = this.minimunConsumption;
        device.turnOn();

        //When
        device.turnOffRequest();
        Integer result = device.getCurrentConsumption();

        //Then
        assertEquals(expectedCurrentConsumption,result);
    }
}