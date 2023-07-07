


package principal;

import operaciones.Suma;
import operaciones.Resta;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int b = sc.nextInt();

        Suma suma = new Suma(a, b);
        Resta resta = new Resta(a, b);

        System.out.println("La suma es: " + suma.calcular());
        System.out.println("La resta es: " + resta.calcular());
    }
}