package system.main;

import system.domain.alarm.SoundAlarm;
import system.domain.device.CriticalDevice;
import system.domain.device.CriticalDeviceMinimumConsumption;
import system.domain.device.Device;
import system.domain.ElectricSystem;
import system.domain.security.LowerPowerSecuritySystem;
import system.domain.security.SecuritySystem;

public class Main {

    public static void main(String[] args){

        Device tv1 = new CriticalDevice("TV1", 35);
        tv1.turnOn();

        Device tv2 = new CriticalDeviceMinimumConsumption("TV2", 30, 3);
        tv2.turnOn();

        ElectricSystem electricSystem = new ElectricSystem(40);
        electricSystem.addDevice(tv1);
        electricSystem.addDevice(tv2);

        SecuritySystem securitySystem = new LowerPowerSecuritySystem(electricSystem, new SoundAlarm());
        securitySystem.perform();

        System.out.println("Se encuentra estable la red ? : " + electricSystem.isStable());

        System.out.println("Estado final de la red : " + electricSystem);

    }
}
