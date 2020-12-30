package system.domain;

public class Device {

    private Boolean isTurnedOn;
    private Integer consumption;

    public Device(Integer consumption) {
        this.consumption = consumption;
    }


    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = false;
    }

    public Boolean getTurnedOn() {
        return isTurnedOn;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public Integer getCurrentConsumption() {
        if(this.getTurnedOn()) {
            return this.getConsumption();
        }
        return 0;
    }
}
