package supermproyecto;

public class Carnes extends Producto{
    protected String caducidad;
    protected String tipo;
    protected String sabor; 

    public Carnes() {
    }

    public Carnes(String caducidad, String tipo, String sabor, String nombre, double precio, String codigo) {
        super(nombre, precio, codigo);
        this.caducidad = caducidad;
        this.tipo = tipo;
        this.sabor = sabor;
    }
    
   
    @Override
    public String toString() {
        return String.format("""
     EL NOMBRE :%s
     EL PRECIO ES : %.2f
     LA CADUCIDAD ES %s                        
     EL SABOR ES :%s
     EL CODIGO ES :%s
     EL TIPO ES: %s""", nombre,precio,caducidad,sabor,codigo,tipo);
    }

   
}
