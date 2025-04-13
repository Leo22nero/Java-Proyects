package supermproyecto;

public class Leche extends Lacteos implements Metodos {
    
       protected String tratamiento;
    public Leche() {
    }
    public Leche(String caducidad, String tipo, String sabor, String nombre, double precio, String codigo,String tratamiento) {
        super(caducidad, tipo, sabor, nombre, precio, codigo);
        this.tratamiento=tratamiento;
    }
     @Override
     public float Cobro(int cantidad) {
    return (float) (cantidad * this.precio);
    
}  
    @Override
    public String toString() {
        return String.format("""
       %s
       ES: %s""", super.toString(),tratamiento);
    }

    @Override
    public void pago(float total) { 
    }
}
