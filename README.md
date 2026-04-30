# Sistema de Pedidos - Cafetería UAM

Simulación de un sistema de gestión de pedidos para una cafetería universitaria, desarrollado en Java aplicando Programación Orientada a Objetos y paso de mensajes entre objetos.

## Descripción

El sistema simula el flujo completo de un pedido: desde que el cliente lo solicita, el cajero lo registra y lo envía a cocina, hasta que la cocina lo prepara y el cajero notifica al cliente.

## Clases

- **Producto** - Representa cada item del pedido con nombre y precio
- **Pedido** - Contiene la lista de productos y el estado del pedido
- **Cocina** - Recibe y prepara el pedido
- **Cajero** - Registra el pedido y coordina la comunicación entre objetos
- **Cliente** - Inicia el flujo realizando el pedido

## Conceptos aplicados

- Programación Orientada a Objetos
- Paso de mensajes entre objetos
- Encapsulamiento con atributos privados, getters y setters
- ArrayList para almacenar productos
- Constructores con y sin parámetros

## Estructura del proyecto

```
src/
└── cafeteria/
    ├── Main.java
    ├── Cliente.java
    ├── Cajero.java
    ├── Cocina.java
    ├── Pedido.java
    └── Producto.java
```

## Ejecución

Compilar desde la carpeta `src`:

```
javac cafeteria/*.java
java cafeteria.Main
```

## Curso

Programación Orientada a Objetos - Universidad Americana (UAM)
