package system.domain.device;

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
                "isTurnedOn=" + getTurnedOn() +
                ", consumption=" + consumption +
                ", name='" + name + '\'' +
                '}';
    }


    public void turnOffRequest() {
        System.out.println("Aceptamos Petición de Apagado para Dispositivo : " + this.toString());
        this.turnOff();
    }

}
