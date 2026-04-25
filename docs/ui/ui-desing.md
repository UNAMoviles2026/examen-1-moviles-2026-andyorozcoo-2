
## Diseño de UI

## Estructura general de la interfaz

La interfaz se diseñará utilizando Jetpack Compose.

La aplicación tendrá dos pantallas principales:

- SpaceListScreen
- SpaceDetailScreen

La primera pantalla muestra el listado de espacios disponibles mediante una LazyColumn. La segunda pantalla muestra la información ampliada del espacio seleccionado.

Ambas pantallas tendrán una BottomBar visible para mantener una navegación básica y coherente dentro de la aplicación.

## Pantalla de listado

La pantalla de listado muestra los espacios de coworking disponibles.

Cada espacio se representa mediante una Card reutilizable que contiene:

- imagen del espacio;
- nombre;
- ubicación;
- capacidad;
- precio por hora;
- disponibilidad;
- botón para ver detalles.

Se utiliza LazyColumn porque permite mostrar listas de forma eficiente y ordenada.

## Pantalla de detalle

La pantalla de detalle muestra información más completa del espacio seleccionado.

Esta pantalla incluye:

- imagen del espacio;
- nombre;
- descripción;
- ubicación;
- capacidad;
- precio por hora;
- disponibilidad;
- botón para reservar.

La idea es que el usuario pueda tomar una decisión con más información antes de realizar una reservación.

## Composables creados

Los composables principales serán:

- SpaceListScreen
- SpaceDetailScreen
- SpaceCard
- AppBottomBar
- ReservationButton

## Componentes reutilizables

Los principales componentes reutilizables son:

- SpaceCard: se utiliza para representar cada espacio dentro del listado.
- AppBottomBar: se mantiene visible en las pantallas principales.
- ReservationButton: representa la acción de reservar.

Separar estos elementos permite que el código sea más limpio, modular y fácil de modificar.

## Justificación de la organización

La interfaz no se implementa en un solo composable porque eso haría que el código sea difícil de leer y mantener.

Por esa razón se separan las pantallas completas de los componentes pequeños. Esta decisión sigue el principio de modularidad, donde cada archivo o componente debe tener una responsabilidad clara.

Además, esta estructura permite reutilizar elementos y facilitar cambios futuros en el diseño.