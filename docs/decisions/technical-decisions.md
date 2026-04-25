# Decisiones Técnicas

## Uso de Jetpack Compose

Se decide utilizar Jetpack Compose porque es la herramienta moderna para crear interfaces en Android. Permite construir pantallas de forma declarativa, con menos código repetitivo y con una estructura más clara.

Además, facilita la creación de componentes reutilizables, lo cual es importante para mantener modularidad en el proyecto.

## Uso de MVVM en frontend

Se selecciona MVVM para el frontend porque permite separar la interfaz de usuario de la lógica de presentación.

Las pantallas se encargan únicamente de mostrar información, mientras que el ViewModel administra el estado y prepara los datos para la UI.

Esto ayuda a evitar código desordenado dentro de los composables.

## Uso de MVC en backend conceptual

Para el backend conceptual se utiliza MVC porque permite separar la entrada de datos, la lógica de negocio y el acceso a datos.

Esta estructura es adecuada para un sistema que puede crecer en el futuro, ya que permite agregar nuevas funcionalidades sin mezclar responsabilidades.

## Justificación final

Las decisiones tomadas buscan que el sistema sea ordenado, escalable y fácil de mantener. La combinación de MVVM en frontend, MVC en backend conceptual y modularidad permite construir una base sólida para una aplicación móvil profesional.