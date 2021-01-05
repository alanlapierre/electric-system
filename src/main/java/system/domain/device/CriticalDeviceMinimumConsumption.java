package system.domain.device;

public class CriticalDeviceMinimumConsumption extends CriticalDevice{

    private Integer minimunConsumption;
    private Integer currentConsumption;

    public CriticalDeviceMinimumConsumption(String name, Integer consumption, Integer minimunConsumption) {
        super(name, consumption);
        this.minimunConsumption = minimunConsumption;
    }

    @Override
    public void turnOffRequest() {
        if(getTurnedOn()) {
            this.currentConsumption = this.minimunConsumption;
            System.out.println("Pasamos a consumo mínimo : " + this.toString());
        }
    }

    @Override
    public void turnOff() {
        this.currentConsumption = 0;
    }

    @Override
    public Boolean getTurnedOn() {
        return this.currentConsumption > 0;
    }

    @Override
    public void turnOn() {
        this.currentConsumption = getConsumption();
    }

    @Override
    public Integer getCurrentConsumption() {
        return this.currentConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + " (current consumption: " + this.currentConsumption + ")";
    }
}
