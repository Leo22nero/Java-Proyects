package supermproyecto;

public class Pollo extends Carnes implements Metodos {
    protected String estado;
    public Pollo() {
    }

    public Pollo(String estado, String caducidad, String tipo, String sabor, String nombre, double precio, String codigo) {
        super(caducidad, tipo, sabor, nombre, precio, codigo);
        this.estado = estado;
    }
    
     @Override
      public float Cobro(int cantidad) {
    return (float) (cantidad * this.precio);
    
}

    @Override
    public String toString() {
        return String.format("""
       %s
     EL POLLO ESTA %s""", super.toString(),estado);
    }
    
    @Override
    public void pago(float total) {}
    
}
