# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa gestiona los saldos de los clientes, mostrando el saldo inicial, procesando una transacción de depósito o retiro y mostrando el saldo final. Utiliza un mensaje de texto simple para indicar el éxito o fracaso de la transacción.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual
- **WS-ID-CLI**: Identificación del Cliente
- **WS-NOM**: Nombre del Cliente
- **WS-MON**: Monto de la Transacción
- **WS-TIP-TRAN**: Tipo de Transacción

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto de la transacción al saldo actual.
- Si el tipo de transacción es 'R', se resta el monto de la transacción del saldo actual, siempre que el saldo sea suficiente.

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR
    A[Inicio] --> B(Mostrar Saldo Inicial)
    B --> C[Procesar Transacción]
    C --> D(Mostrar Saldo Final)
    D --> E[Final]

    subgraph Procesar Transacción
    switch(Comprobar tipo de transacción)
    R - Retirar --> F(Restar monto)
    R - Depósito --> G(Añadir monto)
    end
    
```
