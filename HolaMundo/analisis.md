# Modernización: HolaMundo

## Reglas de Negocio
- Si el tipo de transacción es 'D', se suma el monto al saldo actual
- Si el tipo de transacción es 'R', se resta el monto del saldo actual, siempre que el saldo sea suficiente
- Si el saldo no es suficiente para el retiro, se muestra un mensaje de error

## Glosario
- **WS-CLIENTE**: Trabajo que almacena la información del cliente
- **WS-TRANSACCION**: Trabajo que almacena los detalles de la transacción
- **WS-NOMBRE**: Campo que almacena el nombre del cliente
- **WS-SALDO-ACTUAL**: Campo que almacena el saldo actual del cliente
- **WS-MONTO**: Monto de la transacción
- **WS-MENSAJE-SALIDA**: Campo que almacena el mensaje de salida para el usuario

## Diagrama BPM
```mermaid
graph LR
    CLIENTE --> GESTION-SALDO
    GESTION-SALDO --> BANCO DE DATOS
    GESTION-SALDO -- Retira o deposita --> NOTIFICACIONES
```