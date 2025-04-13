package supermproyecto;

public class DeCaja extends Cereales implements Metodos{
    protected int peso;

    public DeCaja() {
    }

    public DeCaja(int peso, String caducidad, String tipo, String sabor, String nombre, double precio, String codigo) {
        super(caducidad, tipo, sabor, nombre, precio, codigo);
        this.peso = peso;
    }

    @Override
    public String toString() {
    return String.format("""
       %s
       EL PESO ES: %d GM""", super.toString(),peso);
    }
    
    
 @Override
   public float Cobro(int cantidad) {
   return (float) (cantidad * this.precio);
    
} 
 @Override
  public void pago(float total) {}
}
