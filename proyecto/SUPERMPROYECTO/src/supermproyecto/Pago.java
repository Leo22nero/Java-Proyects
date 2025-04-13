package supermproyecto;
import java.util.Scanner;


public class Pago implements Metodos {
Scanner scanner = new Scanner(System.in);
    @Override
    public float Cobro(int cantidad) {
       return 0;
    }

      @Override
    public void pago(float total) {
       float pago = 0;
       float ingreso = 0;
       
       while(pago<total){
           System.out.println("EL TOTAL A PAGAR ES :"+total);
           System.out.println("INGRESE EL PAGO");
           ingreso= scanner.nextFloat();
          if(ingreso<=0){
              System.out.println("EL PAGO NO ES VALIDO");
          }

          pago=pago+ingreso;

            if (pago < total) {
                System.out.printf("TODAVIA FALTA: $%.2f\n", total - pago);
            } else if (pago == total) {
                System.out.println("PAGO EXACTO , GRACIAS POR SU COMPRA");
            } else {
                System.out.printf("PAGO RECIBIDO SU CAMBIO ES: $%.2f\n", pago - total);
            }
       }
    }
}
