# Modernización: HolaMundo

## 1. Reglas de Negocio
- Si el tipo de transacción es 'D', se realiza un depósito, sumando el monto a saldo actual.
- Si el tipo de transacción es 'R', se realiza un retiro:
- Si el saldo actual es mayor o igual al monto retirado, se resta este monto del saldo y se considera exitoso.
- Si el saldo es insuficiente, se muestra un mensaje de error.

## 2. Glosario
- **CLIENTE**: Entidad que mantiene una cuenta en el banco con un saldo monetario.
- **SALDO**: Cantidad de dinero que un cliente tiene en su cuenta bancaria.
- **TRANSACCION**: Una operación que cambia el saldo de un cliente, como un depósito o retiro.


## 3. Diagrama de Proceso de Negocio (BPM)
```mermaid
graph LR

CLIENTE-->INICIO
INICIO-->PROCESO
PROCESO-->RETIRO
RETIRO-->SALDO_OK
SALDO_OK-->FIN
PROCESO-->DEPOSITO
DEPOSITO-->SALDO_ACTUAL
SALDO_ACTUAL-->FIN

subgraph Decisiones
    SALDO_OK(Es suficiente el saldo?)
    click SALDO_OK; Decision{yes}
    end
end

subgraph Archivos o DB
    CLIENTE[Cliente{id: 12345, nombre: Juan Perez, saldo: $5000}]
    SALDO_ACTUAL(Saldo Actual: $5000)
    end

```