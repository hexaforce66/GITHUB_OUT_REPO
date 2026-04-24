# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa gestiona los saldos de los clientes, mostrando el saldo inicial, procesando una transacción de retiro o depósito y mostrando el saldo final. Utiliza un mensaje para indicar el éxito o fracaso de la transacción.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual
- **WS-CLIENTE**: Información del Cliente
- **WS-TRANSACCION**: Detalles de la Transacción

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto a WS-SALDO-ACTUAL
- Si el tipo de transacción es 'R' y el saldo actual es mayor o igual al monto, se resta el monto de WS-SALDO-ACTUAL
- Si el saldo no es suficiente para el retiro, se muestra un mensaje de error

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR
A[Inicio de Transacción] -->|Muestra saldo| B(Mostrar Cliente)
B --> C(Procesar Transacción)
C -->|Calculos| D[Fin de Proceso]

classDef box fill:#f9f,stroke:#333,stroke-width:4px;
class A,D box;
D -->|Muestra saldo final| E[Fin]


```
