package system.domain.security;

import system.domain.alarm.Alarm;
import system.domain.device.Device;
import system.domain.ElectricSystem;

import java.util.*;

public class LowerPowerSecuritySystem extends SecuritySystem {

    public LowerPowerSecuritySystem(ElectricSystem electricSystem, Alarm alarm) {
       super(electricSystem, alarm);
    }

    @Override
    protected Collection<Device> getDevices() {
        List<Device> devices = new ArrayList<>(electricSystem.getDevices());

        Collections.sort(devices, (d1, d2) -> d1.getConsumption() - d2.getConsumption());

        return devices;
    }
}
