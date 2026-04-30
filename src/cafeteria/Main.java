package cafeteria;

public class Main {

    public static void main(String[] args) {

        // Crear objetos
        Cliente cliente = new Cliente("Geanfranco");
        Cajero cajero = new Cajero("Maria");
        Cocina cocina = new Cocina();

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido();
        pedido.agregarProducto(new Producto("Cafe", 1.50));
        pedido.agregarProducto(new Producto("Sandwich", 3.00));
        pedido.agregarProducto(new Producto("Jugo", 2.00));

        // El cliente inicia el flujo completo
        cliente.hacerPedido(cajero, pedido, cocina);
    }
}