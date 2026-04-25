# API Contracts

Aca se van a definir algunos de los endpoints que vamos a trabajar en el backend.
---
## Endpoint 1: Crear un nuevo espacio de coworking
Método

POST

URL

/api/spaces

Descripción

Permite registrar un nuevo espacio de coworking dentro del sistema.

### Request
json
{
"name": "Creative Room",
"description": "Comfortable space for meetings and remote work",
"location": "San José, Costa Rica",
"capacity": 8,
"pricePerHour": 10.0,
"available": true
}

Response exitoso
{
"spaceId": 3,
"message": "Coworking space created successfully",
"status": "CREATED"
}
Response de error
{
"message": "Invalid coworking space data",
"status": "ERROR"
}


## Endpoint 2: Crear una reservación

Método

POST

URL

/api/reservations

### Descripción

Permite crear una reservación para un espacio de coworking seleccionado por el usuario.

### Request
json
{
  "userId": 1,
  "spaceId": 3,
  "reservationDate": "2026-04-25",
  "startTime": "09:00",
  "endTime": "11:00"
}

Response exitoso
{
  "reservationId": 15,
  "message": "Reservation created successfully",
  "status": "CONFIRMED",
  "totalPrice": 20.0
}
Response de error
{
  "message": "The selected space is not available",
  "status": "ERROR"
}

