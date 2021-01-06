package system.domain.alarm;

public class SoundAlarm implements Alarm{
    @Override
    public void activate() {
        //Simulamos acción de una alarma sonora. Es solo para fines del ejercicio de modelado.
        //Para una versión real se debería tener otras consideraciones.
        System.out.println("buuuu buuu buuuu buuuuu");
    }
}
