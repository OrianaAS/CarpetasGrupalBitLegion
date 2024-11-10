
package persona;

import java.util.Scanner;


public class Ejercicio2Clase11 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
      System.out.println("Digite la cantidad a pagar: ");
      double compra = Double.parseDouble(entrada.nextLine());
      double descuento = 0.0;
      if (compra > 100) {
          descuento = compra * 0.2;
      }
      
      double precioFinal = (compra - descuento);
      System.out.println("El precio a pagar es = " + precioFinal);
}
    
}
