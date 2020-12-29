# Electric System
Modelado de sistema electrico con distintas restricciones, a saber:

* Tenemos aparatos que se encienden y se apagan.
* Cada aparato tiene un consumo cuando esta encendido (apagado no consume nada).
* Una red tiene un conjunto de aparatos enchufados.
* Cada red puede proporcionar un máximo de energía.
* Una red puede tener distintos sistemas de seguridad.
* Un sistema de seguridad, al activarse, ha de mirar si el consumo de la red es mayor al soportado. Si es así, ha de apagar los aparatos necesarios para volver a los limites de seguridad.
* Puede haber distintas implementaciones de sistemas de seguridad (que apaguen primero los mas potentes, que apaguen primero los
menos potentes, etc...).
* El sistema de seguridad no puede apagar aparatos críticos (un tipo especial de
aparato). Estos solo se pueden apagar manualmente.
* El sistema de seguridad tiene una alarma.
* Puede haber muchos tipos de alarma (que envían SMS, que hacen
sonar un aparato, etc...). Todos funcionan igual: se activan y se
desactivan.
* Si el sistema de seguridad no puede bajar el consumo por debajo del
nivel soportado, ha de activar el sistema de alarma.
* El sistema de alarma no se alimenta de la red (no tiene un consumo,
como los aparatos).
