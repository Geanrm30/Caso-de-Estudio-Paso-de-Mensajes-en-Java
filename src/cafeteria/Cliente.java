package cafeteria;

public class Cliente {

    // Atributos
    private String nombre;

    // Constructores
    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodos
    public void hacerPedido(Cajero cajero, Pedido pedido, Cocina cocina) {
        System.out.println("Cliente " + nombre + ": Realizando pedido...");
        cajero.recibirPedido(this, pedido);
        cajero.enviarACocina(pedido, cocina);
        cajero.notificarCliente(this, pedido);
    }

    // ToString
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}