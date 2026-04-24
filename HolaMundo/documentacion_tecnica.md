# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa gestiona los saldos de los clientes, mostrando el saldo inicial, procesando una transacción de retiro o depósito y mostrando el saldo final. Utiliza un mensaje para indicar el éxito o fracaso de la transacción.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual
- **WS-CLIENTE**: Información del Cliente
- **WS-TRANSACCION**: Detalles de la Transacción

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto de la transacción al saldo actual.
- Si el tipo de transacción es 'R', se resta el monto de la transacción del saldo actual, siempre que el saldo sea suficiente.

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR
A[Inicio de Transacción] -->|Muestra saldo| B(Procesar Transacción)
B --> C(Mostrar saldo final)
C --> D[Fin de Proceso]

subgraph Caja Negra
   B -->|Depósito| E(Saldo + Monto)
   B -->|Retiro| F(Saldo - Monto)
   F --> G[Saldo Insuficiente]
   E,F --> H(Mensaje de Éxito)
end
```
