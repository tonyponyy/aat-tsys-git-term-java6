package unidad_6;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres generar ?");
        int numero_veces = sc.nextInt();
        System.out.print("Cual será el valor minimo ?");
        double min = sc.nextDouble();
        System.out.print("Y el valor máximo ?");
        double max = sc.nextDouble();
     
        for (int i = 0; i < numero_veces; i++) {
            double random = crea_random(min, max);
            System.out.println(random);
        }
        sc.close();
    }
    
    private static double crea_random(double min, double max) {
        double random = min+Math.random()*(min-max);
        return random;
    }
}