package system.domain.security;

import system.domain.alarm.Alarm;
import system.domain.device.Device;
import system.domain.ElectricSystem;

import java.util.Collection;

public abstract class SecuritySystem {

    protected ElectricSystem electricSystem;
    private Alarm alarm;

    public SecuritySystem(ElectricSystem electricSystem, Alarm alarm) {

        this.electricSystem = electricSystem;
        this.alarm = alarm;
    }

    public Boolean perform() {
        System.out.println("Empezando actuación Sistema Seguridad");

        for (Device device: this.getDevices()) {
            if(electricSystem.isStable()){
                System.out.println("Equilibrio alcanzado: Salimos");
                break;
            }
            device.turnOffRequest();
        }

        boolean isEstable = electricSystem.isStable();

        if(!isEstable) {
            alarm.activate();
            return false;
        }
        return true;
    }

    protected abstract Collection<Device> getDevices();
}
