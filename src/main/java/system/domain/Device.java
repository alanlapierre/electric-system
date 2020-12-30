package system.domain;

public class Device {

    private Boolean isTurnedOn;
    private Integer consumption;
    private String name;


    public Device(String name, Integer consumption) {

        this.consumption = consumption;
        this.name = name;
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

    @Override
    public String toString() {
        return "Device{" +
                "isTurnedOn=" + isTurnedOn +
                ", consumption=" + consumption +
                ", name='" + name + '\'' +
                '}';
    }

}
