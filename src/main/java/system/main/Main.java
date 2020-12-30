package system.main;

import system.domain.Device;
import system.domain.ElectricSystem;

public class Main {

    public static void main(String[] args){

        Device tv = new Device(30);
        tv.turnOn();

        ElectricSystem electricSystem = new ElectricSystem();
        electricSystem.addDevice(tv);

        System.out.println("TV encendida ? " + tv.getTurnedOn() + " consumo del aparato: " + tv.getConsumption());
        System.out.println("Cantidad de equipos conectados a la red: " + electricSystem.numberOfDevices());

    }
}
