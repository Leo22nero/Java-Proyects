package supermproyecto;

public abstract class Producto {
     protected String nombre;
    protected double precio;
    protected String codigo;

    public Producto() {
    }

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
}
