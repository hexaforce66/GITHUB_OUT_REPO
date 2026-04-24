# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa gestiona los saldos de los clientes, mostrando el saldo inicial, procesando una transacción de retiro o depósito y mostrando el saldo final. Utiliza un mensaje para indicar el éxito o fracaso de la transacción.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual
- **WS-CLIENTE**: Información del Cliente
- **WS-TRANSACCION**: Detalles de la Transacción

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto a WS-SALDO-ACTUAL
- Si el tipo de transacción es 'R' y el saldo actual es mayor o igual al monto, se resta el monto del saldo; de lo contrario, se informa que el saldo es insuficiente

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR

subgraph Programa Principal
CLIENTE -->|mostrar| INICIO DE TRANSACCION
CLIENTE -->|mostrar| SALDO INICIAL
PROCESAR-TRANSACCION --> FIN DE PROCESO
end

subgraph Procesar Transaccion
D --> DEPÓSITO
R -
   > RETIRO
end
```
