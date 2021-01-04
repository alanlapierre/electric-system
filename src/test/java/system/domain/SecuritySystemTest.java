package system.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import system.domain.device.Device;
import system.domain.securitysystem.BasicSecuritySystem;
import system.domain.securitysystem.SecuritySystem;

import java.util.Arrays;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.when;

class SecuritySystemTest {

    private static Device device1;
    private static Device device2;
    private static ElectricSystem electricSystem;
    private static SecuritySystem securitySystem;


    @BeforeAll
    public static void beforeAllTests() {

        device1 = Mockito.mock(Device.class);
        device2 = Mockito.mock(Device.class);

        electricSystem = Mockito.mock(ElectricSystem.class);
        when(electricSystem.getDevices()).thenReturn(Arrays.asList(device1, device2));

        securitySystem = new BasicSecuritySystem(electricSystem);

    }

    // CP1: Dado un Sistema de seguridad con una red en estado NO ESTABLE, SE APAGAN todos los dispositivos de dicha red
    // para alcanzar la estabilidad.
    @Test
    public void Given_An_SecuritySystem_With_An_Not_Stable_ElectricSystem_When_Perform_Method_Is_Called_Then_All_Devices_Are_TurnedOff(){
        //Given
        when(electricSystem.isStable()).thenReturn(false);

        //When
        securitySystem.perform();

        //Then
        Mockito.verify(device1).turnOff();
        Mockito.verify(device2).turnOff();

    }

    // CP2: Dado un Sistema de seguridad con una red en estado ESTABLE, NO SE APAGA ningún dispositivo de dicha red.
    @Test
    public void Given_An_SecuritySystem_With_An_Stable_ElectricSystem_When_Perform_Method_Is_Called_Then_No_Device_Is_TurnedOff(){
        //Given
        when(electricSystem.isStable()).thenReturn(true);

        //When
        securitySystem.perform();

        //Then
        Mockito.verify(device1, never()).turnOff();
        Mockito.verify(device2, never()).turnOff();

    }

}
