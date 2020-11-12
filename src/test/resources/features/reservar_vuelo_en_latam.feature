#language: es
Característica: Reserva de vuelo en LATAM Airline
  Yo como usuario de LATAM
  Quiero reservar un vuelo
  Para realizar el viaje esperado


  Escenario: Reversar un vuelo de Medellín hacia Santa Marta el dia de hoy
    Dado que Daniel ingresa a la pagina de LATAM
    Cuando Daniel intenta reservar un vuelo desde MDE hacia SMR
      | origen | destino | nombre | apellido | numeroDeIdentificacion | correoElectronico   | area | numeroDeTelefono |
      | MDE    | SMR     | Daniel | Correa   | 12344                  | daniel123@gmail.com | 1    | 4000222          |
    Entonces deberia ver el medio de pago para terminar su reversa