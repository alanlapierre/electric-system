package system.main;

import system.domain.securitysystem.BasicSecuritySystem;
import system.domain.Device;
import system.domain.ElectricSystem;
import system.domain.securitysystem.LowerPowerSecuritySystem;
import system.domain.securitysystem.SecuritySystem;

public class Main {

    public static void main(String[] args){

        Device tv1 = new Device("TV1", 35);
        tv1.turnOn();

        Device tv2 = new Device("TV2", 30);
        tv2.turnOn();

        ElectricSystem electricSystem = new ElectricSystem(40);
        electricSystem.addDevice(tv1);
        electricSystem.addDevice(tv2);

        SecuritySystem securitySystem = new LowerPowerSecuritySystem(electricSystem);
        securitySystem.perform();

        System.out.println("Se encuentra estable la red ? : " + electricSystem.isStable());

        System.out.println("Estado final de la red : " + electricSystem);

    }
}
