# Diseño Backend Conceptual

## Arquitectura backend seleccionada

Para esta parte de el backend conceptual se utilizará una arquitectura basada en MVC y organizada por capas. 

Se define esta estructura para explicar cómo funcionaría el sistema en una versión completa.

La arquitectura se divide en 3 capas:

- Controller
- Service
- Repository
- Model


## Controller

El Controller es la capa encargada de recibir las solicitudes HTTP enviadas desde la aplicación móvil.

Por ejemplo, cuando el usuario quiere reservar un espacio, la app enviaría una solicitud al backend. El Controller recibe esa solicitud, valida que la información venga completa y llama al Service correspondiente.

## Service

El Service contiene la lógica principal del sistema, basicamente lo que hace el sistema va a estar aca.

En esta capa se validarían las reglas del negocio:

- verificar si el espacio existe;
- revisar si el espacio está disponible;
- validar la fecha y hora de la reservación;
- calcular el precio total;
- crear la reservación.

Esta capa es importante porque evita que la lógica quede mezclada con el Controller o con el acceso a datos.

## Repository

El Repository se encarga del acceso a la Base de Datos.

Su responsabilidad sería consultar, guardar, actualizar o eliminar información de la base de datos. Por ejemplo, buscar espacios disponibles.

## Model

El Model representa las entidades principales del sistem:

- CoworkingSpace
- Reservation
- User


## Flujo de una petición

Ejemplo: crear una reservación.

1. El usuario presiona el botón de reservar en la app.
2. La app envía una solicitud POST al backend.
3. El Controller recibe la solicitud.
4. El Controller valida la información básica.
5. El Service verifica las reglas de negocio.
6. El Repository consulta si el espacio está disponible.
7. Si todo está correcto, el Repository guarda la reservación.
8. El Service devuelve el resultado al Controller.
9. El Controller responde a la app con un mensaje de éxito o error.

## Justificación

Se utiliza MVC en el backend porque permite separar responsabilidades y mantener el sistema ordenado.

Esta estructura mejora la mantenibilidad, ya que si en el futuro se necesita cambiar la base de datos, modificar reglas de negocio o agregar nuevos endpoints, se puede hacer sin afectar todo el sistema.