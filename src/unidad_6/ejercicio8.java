package unidad_6;

import java.util.Scanner;

public class ejercicio8 {
	 static Scanner sc = new Scanner(System.in);
     static int[] array = new int[10];
     
    public static void main(String[] args) {
        pregunta_numero();
        imprime_numero();
        sc.close();
    }
    
    public static void pregunta_numero() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce posición: "+(i+1)+"/10");
            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                array[i] = numero;
            } else {
                System.out.println("Introduce un número válido.");
                i--;
                sc.nextLine(); 
            }
        }
    }
    
    public static void imprime_numero() {
    for (int i = 0; i < array.length; i++) {
        System.out.println("Elemento " + i + ": " + array[i]);
    	}
    }
    
    
    
}