package system.domain.securitysystem;

import system.domain.Device;
import system.domain.ElectricSystem;
import java.util.Collection;

public class BasicSecuritySystem extends SecuritySystem {

    public BasicSecuritySystem(ElectricSystem electricSystem) {
        super(electricSystem);
    }

    @Override
    protected Collection<Device> getDevices() {
        return electricSystem.getDevices();
    }
}
