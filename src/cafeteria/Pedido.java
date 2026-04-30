package cafeteria;

import java.util.ArrayList;

public class Pedido {

    // Atributos
    private ArrayList<Producto> productos;
    private String estado;

    // Constructores
    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    // Getters y Setters
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Metodos
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void cambiarEstado(String e) {
        this.estado = e;
    }

    public void mostrarDetalle() {
        System.out.println("--- Detalle del pedido ---");
        for (Producto p : productos) {
            System.out.println("Producto: " + p.getNombre() + " | Precio: $" + p.getPrecio());
        }
        System.out.println("Estado: " + estado);
    }

    // ToString
    @Override
    public String toString() {
        return "Pedido{" +
                "productos=" + productos +
                ", estado='" + estado + '\'' +
                '}';
    }
}