# Modernización: HolaMundo

## Reglas de Negocio
- El mensaje 'Hola Mundo' se muestra en la pantalla.

## Glosario
- **COBOL**: Un lenguaje de programación antiguo pero aún utilizado en algunos sistemas legacy.

## Diagrama BPM
```mermaid
graph LR

A --> B

classDef n fill:#f9f,stroke:#333,stroke-width:4px
class n {
  rect
  text
}

A(Display) -->|Imprime en pantalla| B(Stop Run)
B -->|Termina el programa| A
```