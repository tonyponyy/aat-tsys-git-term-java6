package unidad_6;

import java.util.Scanner;

public class ejercicio9 {
	 static Scanner sc = new Scanner(System.in);

	 public static void main(String[] args) {
		 System.out.print("Introduce tamaño de array");
         if (sc.hasNextInt()) {
        	 int numero_array = sc.nextInt();
        	 int[] new_array = genera_array(numero_array);
        	 muestra_array(new_array);
        	 muestra_suma_array(new_array);
        	    
         }else {
        	 System.out.print("Introduce numero valido");
         }
             
	        sc.close();
	    }
	 
	 
	 private static int[] genera_array(int numero_array) {
		 int[] array = new int[numero_array];
 	    for (int i = 0; i < array.length; i++) {
 	        array[i] = crea_random(0,9);
 	    }
 	    return array;
	    }
	 
	 
	 private static void muestra_array(int[] array) {
		 for (int i = 0; i < array.length; i++) {
			 System.out.print((i+1)+"-"+array[i]+" ");
	 	    }
	 }
	 private static void muestra_suma_array(int[] array) {
		 int resultado = 0;
		 for (int i = 0; i < array.length; i++) {
			 resultado += array[i];
	 	    }
		System.out.print("Resultado :"+resultado);
	 }
	 

	 private static int crea_random(double min, double max) {
	        int random = (int) (min+Math.random()*(min-max));
	        return Math.abs(random);
	    }
	 
}
