/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%. 
*/
import java.util.Scanner;

public class Repromusic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresar el valor de su compra: ");
        Double prec=sc.nextDouble();
        System.out.println("¿Compró algún reporductor de música marca Nosy? (si/no)");
        String rta=sc.next();

        double desc=0;

        if (prec>=500) {
            desc += 0.10;
        }
        if (rta.equalsIgnoreCase("si")) {
            desc += 0.05;
        }

        double totDesc=prec*(1-desc);
        double precTot=totDesc*1.19;


        System.out.println("El precio con descuento es de U$"+totDesc);
        System.out.println("El precio con descuento y valor de iva incluido es de U$"+precTot);
    }
}
