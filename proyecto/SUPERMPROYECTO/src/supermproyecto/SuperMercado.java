package supermproyecto;
import java.util.Scanner;

public class SuperMercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pago pago1 = new Pago();
        float total = 0;
        int estado = 0;
        int cantidad=0;

     do {
         System.out.println(String.format("""
            MENU DE COMPRA
            1-LACTEOS
            2-CEREALES
            3-CARNES
            4-SALIDA"""));
         estado=scanner.nextInt();
         switch (estado){
                 case 1:
                    Leche leche1 =new Leche("11/02/2027", "LECHE", "NATURAL", "ALPURA",
                            31, "S3231HM","DESLACTOSADA");
                    System.out.println(leche1.toString());
                    System.out.println("INGRESE LA CANTIDA:");
                    cantidad=scanner.nextInt();
                    total=total+leche1.Cobro(cantidad);   
                     
                 break;
            
                 case 2:
                    DeCaja caja1 =new DeCaja(700,"10/9/2028"," CEREA DE CAJA","MIEL Y TRIGO",
                            "CHEERIOS",45,"MKS2233S");
                    System.out.println(caja1.toString());
                    System.out.println("INGRESE LA CANTIDA:");
                    cantidad=scanner.nextInt();
                    total=total+caja1.Cobro(cantidad);   
                 break;
                 case 3:
                     Pollo pollo1 =new Pollo("PRECOCIDO","CONGELADO", "POLLO", "AHUMADO",
                             "FILETES DE POLLO", 150,"P11264");
                     System.out.println(pollo1.toString());
                     System.out.println("INGRESE LA CANTIDA:");
                     cantidad=scanner.nextInt();
                     total=total+pollo1.Cobro(cantidad);
                 break;
                 default:
                     break;
         }
         }while (estado != 4);
     pago1.pago(total);
    }
    
}
