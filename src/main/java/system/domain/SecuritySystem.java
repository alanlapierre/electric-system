package system.domain;

public class SecuritySystem {

    private ElectricSystem electricSystem;

    public SecuritySystem(ElectricSystem electricSystem) {
        this.electricSystem = electricSystem;
    }

    public Boolean perform() {
        System.out.println("Empezando actuación Sistema Seguridad");

        for (Device device: electricSystem.getDevices()) {
            if(electricSystem.isStable()){
                System.out.println("Equilibrio alcanzado: Salimos");
                break;
            }
            System.out.println("Apagamos : " + device);
            device.turnOff();
        }
        return electricSystem.isStable();
    }
}
