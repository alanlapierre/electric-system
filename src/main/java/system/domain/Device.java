package system.domain;

public class Device {

    private Boolean isTurnedOn;

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = false;
    }

    public Boolean getTurnedOn() {
        return isTurnedOn;
    }
}
