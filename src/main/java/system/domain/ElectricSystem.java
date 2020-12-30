package system.domain;

import java.util.HashSet;
import java.util.Set;

public class ElectricSystem {
    private Set<Device> devices;

    public ElectricSystem() {
        devices = new HashSet<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public Integer numberOfDevices() {
        return devices.size();
    }
}
