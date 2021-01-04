package system.domain.device;

public class CriticalDevice extends Device {

    public CriticalDevice(String name, Integer consumption) {
        super(name, consumption);
    }

    @Override
    public void turnOffRequest() {
        System.out.println("Ignoramos Petición de Apagado para Dispositivo Critico : " + this.toString());
        this.turnOff();
    }
}
