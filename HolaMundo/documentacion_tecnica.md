# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa COBOL 'Gestión de Saldo' realiza transacciones financieras en cuenta bancaria. Muestra el nombre del cliente, su saldo inicial y las transacciones realizadas. Simula un proceso de retiro o depósito en función del tipo de transacción ingresado. Incluye validaciones para asegurar que el saldo sea suficiente en los retiros.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual
- **R**: Retiro
- **D**: Depósito
- **WS-MONTO**: Monto de la Transacción

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto transaccionado al saldo actual.
- Si el tipo de transacción es 'R', se resta el monto de la transacción del saldo actual, siempre que el saldo sea suficiente.

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR

style default fill:#FDF6E3,stroke:#666,stroke-width:4px

subgraph Grupo de Cliente

C[CLIENTE] -->|ID| 12345
C -->|NOMBRE| JUAN PEREZ
C -->|SALDO| $5000

end

C --> P

subgraph Proceso Transaccion

P -->|INICIO|>

P --> PROCESAR

PROCESAR -->|TIPO?| D
PROCESAR(D) -->|ADDS| R

PROCESAR(R) -->|MONTO?| 

PROCESAR(R) -.->|OK| FIN
PROCESAR(R) -.->|ERR| FIN

FIN -->|FIN|>

end

```
