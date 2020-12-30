package system.domain;

import java.util.HashSet;
import java.util.Set;

public class ElectricSystem {
    private Set<Device> devices;
    private Integer maximumPowerAllowed;

    public ElectricSystem(Integer maximumPowerAllowed) {
        devices = new HashSet<>();
        this.maximumPowerAllowed = maximumPowerAllowed;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public Integer numberOfDevices() {
        return devices.size();
    }

    public Integer getCurrentConsumption() {
        Integer currentConsumption = 0;

        for (Device device: devices) {
            currentConsumption += device.getCurrentConsumption();
        }

        return currentConsumption;
    }

    public Boolean isStable() {
        return this.getCurrentConsumption() <= this.maximumPowerAllowed;
    }
}
