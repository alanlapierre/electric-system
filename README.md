# KATA DE MODELADO - SISTEMA ELÉCTRICO

En este ejercicio realizamos el modelado de un Sistema Electrico, cuyas necesidades puntuales se detallan a continuación:

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


## Nuestro objetivo

Se pretende crear un **modelado del dominio** que respete las practicas de **código limpio**, con buena **separación de responsabilidades** y lo **suficientemente flexible** como para reducir el impacto de los cambios y mejoras. Siempre teniendo en cuenta los principios **SOLID** y **GRASP** para generar una pieza de codigo mantenible.

Por otro lado, también se pretende incluir la suficiente cantidad de **tests unitarios** como para validar el avance. Si bien el desarrollo en si no fue realizado con **TDD**, la idea es tener un buen **coverage** del codigo generado.


### Diseño de Solución - Diagrama de Clases 

<p align="center">
  <img src="https://github.com/alanlapierre/electric-system/blob/master/images/kata_modelado_diagrama.jpg" alt="Diagrama de clases resultante"/>
</p>

## Notas
* El diseño se mantiene simple, respetando lo propuesto por el enunciado. Sin agregar complejidad en base a supuestos exagerados.
* El objetivo fue el modelado del dominio en si, por eso no se puso trabajo extra en cosas como la "traza" de logs, el desarrollo de los distintos tipos de alarmas o el agregado de otros dispositivos más elaborados (solamente se agrega uno extra para demostrar en que formas puede extenderse la solución planteada).

## Licencia MIT
**Para uso totalmente libre.**
