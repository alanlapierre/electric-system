package system.domain.securitysystem;

import system.domain.device.CriticalDevice;
import system.domain.device.Device;
import system.domain.ElectricSystem;

import java.util.Collection;

public abstract class SecuritySystem {

    protected ElectricSystem electricSystem;

    public SecuritySystem(ElectricSystem electricSystem) {
        this.electricSystem = electricSystem;
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
        return electricSystem.isStable();
    }

    protected abstract Collection<Device> getDevices();
}
