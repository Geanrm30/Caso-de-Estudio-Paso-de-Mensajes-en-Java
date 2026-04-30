package cafeteria;

public class Cocina {

    // Metodos
    public void prepararPedido(Pedido pedido) {
        System.out.println("Cocina: Preparando el pedido...");
        pedido.cambiarEstado("En preparacion");

        for (Producto p : pedido.getProductos()) {
            System.out.println("Cocina: Preparando " + p.getNombre());
        }

        pedido.cambiarEstado("Listo");
        System.out.println("Cocina: Pedido listo.");
    }

    // ToString
    @Override
    public String toString() {
        return "Cocina{}";
    }
}