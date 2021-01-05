package system.domain.security;

import system.domain.alarm.Alarm;
import system.domain.device.Device;
import system.domain.ElectricSystem;
import java.util.Collection;

public class BasicSecuritySystem extends SecuritySystem {

    public BasicSecuritySystem(ElectricSystem electricSystem, Alarm alarm) {
        super(electricSystem, alarm);
    }

    @Override
    protected Collection<Device> getDevices() {
        return electricSystem.getDevices();
    }
}
