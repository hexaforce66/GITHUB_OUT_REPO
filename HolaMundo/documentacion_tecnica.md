# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa gestiona los saldos de los clientes, mostrando el saldo inicial, procesando una transacción de depósito o retiro y mostrando el saldo final. Utiliza un código de transacción para determinar el tipo de operación.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual
- **WS-CLIENTE**: Información del cliente
- **WS-TRANSACCION**: Detalles de la transacción

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto a WS-SALDO-ACTUAL
- Si el tipo de transacción es 'R', se resta el monto del saldo actual siempre que este sea suficiente

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR
A[Inicio de Transacción] --> B(Mostrar saldo inicial)
B --> C(Procesar transacción)
C --> D(Mostrar saldo final)

subgraph Procesar Transacción
style dashed
label Procesar-Transacción
D[Depósito \n(WS-TIPO-TRANS = 'D')] --> E(Agregar monto a saldo)
D --> F(Retiro) 
F -->|Saldo suficiente| G(Restar monto del saldo)
F -->|Saldo insuficiente| H(Mensaje de error)
end

```
