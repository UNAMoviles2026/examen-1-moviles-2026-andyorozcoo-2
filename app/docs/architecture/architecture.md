# Arquitectura del Sistema

La aplicación propuesta será una aplicación móvil nativa para Android, desarrollada con Kotlin y Jetpack Compose.

Decidi utilizar una aplicación nativa porque permite aprovechar mejor las características propias del sistema Android, tener una interfaz más fluida y mantener un mejor rendimiento en comparación con otras alternativas. 
Además, Jetpack Compose permite crear interfaces modernas de forma más ordenada y declarativa.

La aplicación está enfocada en la gestión de espacios de coworking, donde el usuario puede visualizar espacios disponibles, consultar información detallada y realizar una reservación.

## Patrón de arquitectura seleccionado

Para el frontend se utilizará el patrón MVVM, que significa Model, View y ViewModel.

Este patrón se adapta bien al proyecto porque permite separar la interfaz gráfica de la lógica de presentación. De esta forma, las pantallas no se encargan directamente de manejar datos o reglas, sino que reciben información desde el ViewModel.

## Aplicación de MVVM en el sistema

- Model: representa las entidades principales del sistema, como el espacio de coworking y la reservación.
- View: representa las pantallas creadas con Jetpack Compose, por ejemplo la pantalla de listado y la pantalla de detalle.
- ViewModel: se encarga de manejar el estado de la interfaz y preparar los datos que serán mostrados en pantalla.

La arquitectira del MVVM nos va ayudar a tener un codigo mucho mas limpio, ordenado, facil de entender, modificar y reutilizar.
El MVVM es muy bueno porque a la hora de hacer algun cambio o si algo tiene algun bug, no se daña todo el sistema como tal.

## Modularidad del sistema

El proyecto se organizará por módulos o carpetas según su responsabilidad. La idea es evitar tener todo el código junto en un solo archivo o en una sola pantalla.

La estructura propuesta para la app es:

- screens: pantallas completas de la aplicación.
- components: componentes reutilizables.
- models: clases de datos.
- data: datos simulados.
- navigation: manejo de navegación entre pantallas.
- viewmodel: manejo del estado de la interfaz.

Esta organización permite que cada parte del sistema tenga una responsabilidad clara.

## Diagrama de arquitectura

Usuario
↓
Pantallas en Jetpack Compose
↓
ViewModel
↓
Model / Mock Data
↓
Respuesta visual en la interfaz

En una versión completa del sistema, el flujo sería:

Usuario
↓
App móvil
↓
ViewModel
↓
Repositorio
↓
API Backend
↓
Controller
↓
Service
↓
Repository
↓
Base de datos

## Flujo general del sistema

El usuario abre la aplicación y observa un listado de espacios de coworking disponibles. La pantalla solicita la información al ViewModel, el cual obtiene los datos  desde la capa de datos.

Cuando el usuario selecciona un espacio, la aplicación navega hacia una pantalla de detalle donde se muestra información ampliada como nombre, imagen, descripción, ubicación, capacidad, precio por hora y disponibilidad.

Desde la pantalla de detalle, el usuario puede presionar un botón para realizar una reservación.