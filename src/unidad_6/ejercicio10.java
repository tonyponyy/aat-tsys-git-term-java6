package unidad_6;

import java.util.Scanner;

public class ejercicio10 {
	 static Scanner sc = new Scanner(System.in);

	 public static void main(String[] args) {
		 System.out.print("Introduce tamaño de array");
         if (sc.hasNextInt()) {
        	 int numero_array = sc.nextInt();
        	 int[] new_array = genera_array_primos(numero_array);
        	 muestra_array(new_array);
         }else {
        	 System.out.print("Introduce numero valido");
         }
             
	        sc.close();
	    }
	 
	 
	 private static int[] genera_array_primos(int numero_array) {
		 int[] array = new int[numero_array];
 	    for (int i = 0; i < array.length; i++) {
 	        array[i] = crea_random_primos(0,9);
 	    }
 	    return array;
	    }
	 
	 
	 private static void muestra_array(int[] array) {
		 for (int i = 0; i < array.length; i++) {
			 System.out.print((i+1)+"-"+array[i]+" ");
	 	    }
	 }

	 private static int crea_random_primos(double min, double max) {
		    while (true) {
		        int random = (int) (min+Math.random()*(max-min));
		        if (es_primo(random)) {
		            return random;
		        }
		    }
		}
	 
		private static boolean es_primo(int n) {
		    for(int i=2;i<n;i++) {
		        if(n%i==0) {
		        	return false;
		        }
		    }
		    return true;
		}
	 
}