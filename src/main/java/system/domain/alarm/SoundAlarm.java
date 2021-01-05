package system.domain.alarm;

public class SoundAlarm implements Alarm{
    @Override
    public void activate() {
        //Simulamos accion de una alarma sonora. Puede haber otros tipos de alarmas en el sistema.
        System.out.println("buuuu buuu buuuu buuuuu");
    }
}
