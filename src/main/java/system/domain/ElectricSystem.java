package system.domain;

import java.util.ArrayList;
import java.util.Collection;
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

        System.out.println("Añadiendo : " + device);
        devices.add(device);
    }

    public Integer numberOfDevices() {
        return devices.size();
    }

    public Integer getCurrentConsumption() {
        Integer currentConsumption = 0;

        for (Device device: this.getDevices()) {
            currentConsumption += device.getCurrentConsumption();
        }

        return currentConsumption;
    }

    public Boolean isStable() {
        return this.getCurrentConsumption() <= this.maximumPowerAllowed;
    }

    public Collection<Device> getDevices() {
        return new ArrayList<>(devices);
    }

    @Override
    public String toString() {
        return "ElectricSystem{" +
                "devices=" + devices +
                '}';
    }
}
