/*
En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
 */
import java.util.Scanner;

public class Servitec1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de llantas a comprar: " );
        int numLlan=sc.nextInt();
        
        int valLlan;

        if (numLlan==0) {
            valLlan=0;
        }else if (numLlan<5) {
            valLlan=100; 
        }else if (numLlan<= 10) {
            valLlan=75; 
        }else {
            valLlan=50;   
        }
        int valTllan = numLlan*valLlan;

        System.out.println("El valor de cada una sus llantas es de U$"+valLlan);
        System.out.println("El valor total de su compra es de U$"+valTllan);
    }
}    