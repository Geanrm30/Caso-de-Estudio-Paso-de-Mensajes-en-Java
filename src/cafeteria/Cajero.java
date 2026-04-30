package cafeteria;

public class Cajero {

    // Atributos
    private String nombre;

    // Constructores
    public Cajero() {
    }

    public Cajero(String nombre) {
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
    public void recibirPedido(Cliente cliente, Pedido pedido) {
        System.out.println("Cajero " + nombre + ": Recibiendo pedido de " + cliente.getNombre());
        pedido.mostrarDetalle();
    }

    public void enviarACocina(Pedido pedido, Cocina cocina) {
        System.out.println("Cajero " + nombre + ": Enviando pedido a cocina...");
        cocina.prepararPedido(pedido);
    }

    public void notificarCliente(Cliente cliente, Pedido pedido) {
        System.out.println("Cajero " + nombre + ": Notificando a " + cliente.getNombre());
        System.out.println("Su pedido esta: " + pedido.getEstado());
    }

    // ToString
    @Override
    public String toString() {
        return "Cajero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}