# Documentación de Modernización: HolaMundo

## 1. Resumen Funcional
El programa COBOL 'Gestión de Saldo' realiza transacciones financieras en cuenta bancaria. Muestra el nombre del cliente, su saldo inicial y las transacciones realizadas. Simula un proceso de retiro o depósito en función del tipo de transacción ingresada.

Variablemente, WS-TIPO-TRANS 'R' representa una transacción de retiro y 'D' una de depósito.

## 2. Glosario de Variables Bancarias
- **WS-SAL-ACT**: Saldo Actual de la Cuenta
- **WS-TIPO-TRANS**: Tipo de Transacción
- **WS-MONTO**: Monto de la Transacción
- **WS-CLIENTE**: Información del Cliente

## 3. Reglas de Negocio Detectadas
- Si el tipo de transacción es 'D', se suma el monto al saldo actual.
- Si el tipo de transacción es 'R', se resta el monto del saldo actual, siempre que este sea suficiente. De lo contrario, muestra un mensaje de error.

## 4. Diagrama de Proceso (BPMN)
```mermaid
graph LR
    A[Inicio de Transacción] --> B(Mostrar Datos Cliente) --> C{
Procesar Transacción}
    C --> |Condición: WS-TIPO-TRANS == 'D'
    D(Depósito) --> E(Suma monto)
    C --> |Condición: WS-TIPO-TRANS == 'R'
    F(Retiro)
    F --> |Condición: WS-SALDO-ACTUAL >= WS-MONTO
    G(Éxito) --> H(Resta monto)
    F --> |Condición: WS-SALDO-ACTUAL < WS-MONTO
    I(Error) --> J(Mostrar Mensaje)
    H,G --> J
    J --> K[Fin de Proceso]
    click D ../depositar
    click F ../retirar
    click G ../exitoso
    click I ../insuficiente
```
