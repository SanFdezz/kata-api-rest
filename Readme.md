# Kata Api-Rest

## Duración aproximada
    2 horas

## ¿Que se pide en esta kata?
Con esta Kata vamos a poner a prueba tus conocimientos de API - Rest adquiridos en la parte teórica, para ello vamos a separar esta kata en 2 partes, una de diseño de la API-REST y otra en la que será la implementación. 

Necesitamos crear 5 endpoints (uno para cada verbo http) en este caso servirán para la gestión de trabajadores.

#### En la carpeta model tienes las 2 clases necesarias para poder desarrollar correctamente esta kata: 
#### Clase Employee
#### Enum Area

Url del endpoint: 
- Verbo que se usará para esa funcionalidad 
- Que parámetros va a recibir y cómo los vas a pasar (cuando sea necesario)
- Que información va a devolver y porque 
- Que código de respuesta http va a dar el endpoint expuesto

### Parte teórica: 
Definir los endpoints en el readme (en el apartado diseño de la API)

En cuanto al diseño, en el readme del proyecto, tienes que hacer un borrador de lo que vas a hacer respecto los 5 endpoints que se indican:

### Parte práctica:
Debes crear la implementación, es decir, tienes que tener los 5 endpoints operativos.
En cuanto a la implementación, debes realizar un Controlador que sirva para exponer los 5 verbos de http y poder consumirlos, estos 5 endpoints no deben de tener lógica ninguna, en el caso que consideres oportuno devolver algo, puedes devolver un mensaje indicando que ha hecho cada acción, por ejemplo, en el caso del endpoint dedicado a recuperar, puedes devolver un String indicando: “Este endpoint sirve para recuperar información”.

# Solución
A continuación dispones de una estructura a modo de ejemplo de lo que tienes que poner en la parte inferior, puedes añadir o modificar campos libremente.

## Diseño de la API: 

### HTTP GET /employees/{id}
- Description: Let us obtain all the workers from the system.
- Request: Requests data from a specified resource.
- Response: 200 OK

### HTTP POST /employees
- Description: Let us create a new worker in the system.
- Request: Submits data to be processed to a specified resource.
- Response: 201 Created

### HTTP PUT /employees/{id}
- Description: Let us fully update the employees data
- Request: Updates a specified resource with the data provided.
- Response: 200 OK

### HTTP DELETE /employees/{id}
- Description: Let us delete an employee
- Request: Deletes a specified resource.
- Response: 200 OK

### HTTP PATCH /employees/{id}
- Description: Let us modify only one field without changing the entire employee data
- Request: Applies partial modifications to a resource.
- Response: 200 OK


