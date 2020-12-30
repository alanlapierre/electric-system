package system.main;

import system.domain.Device;
import system.domain.ElectricSystem;

public class Main {

    public static void main(String[] args){

        Device tv1 = new Device(30);
        tv1.turnOn();

        Device tv2 = new Device(50);
        tv2.turnOff();

        ElectricSystem electricSystem = new ElectricSystem();
        electricSystem.addDevice(tv1);
        electricSystem.addDevice(tv2);

        System.out.println("TV1 encendida ? " + tv1.getTurnedOn() + " consumo del aparato: " + tv1.getConsumption());
        System.out.println("TV2 encendida ? " + tv2.getTurnedOn() + " consumo del aparato: " + tv2.getConsumption());

        System.out.println("Cantidad de equipos conectados a la red: " + electricSystem.numberOfDevices());
        System.out.println("Consumo actual de la red: " + electricSystem.getCurrentConsumption());

    }
}
