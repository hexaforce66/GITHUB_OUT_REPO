# Modernización: HolaMundo

## 1. Reglas de Negocio
- Si el tipo de transacción es 'D', se suma el monto al saldo actual y se muestra un mensaje de depósito exitoso.
- Si el tipo de transacción es 'R', se resta el monto del saldo actual si este es suficiente, mostrando un mensaje de éxito o fallo.

## 2. Glosario
- **WS**: Working Storage, área de almacenamiento temporal en COBOL.
- **PIC**: Picture Clause, define el formato de los datos en COBOL.


## 3. Diagrama de Proceso de Negocio (BPM)
```mermaid
graph LR
    CLIENTE --> GESTION-SALDO
    GESTION-SALDO --> BANCO DE DATOS
    GESTION-SALDO --> PROCESAR-TRANSACCION
    PROCESAR-TRANSACCION --> RETIRO
    PROCESAR-TRANSACCION --> DEPOSITO
    RETIRO --> SALDO INSUFICIENTE
    RETIRO --> RETIRO EXITOSO
    DEPOSITO --> DEPOSITO EXITOSO
```