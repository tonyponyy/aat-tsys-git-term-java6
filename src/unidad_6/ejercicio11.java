package unidad_6;

import java.util.Scanner;

public class ejercicio11 {
	 static Scanner sc = new Scanner(System.in);
	
	 public static void main(String[] args) {
		 System.out.print("Introduce tamaño de array");
         if (sc.hasNextInt()) {
        	 int numero_array = sc.nextInt();
        	 int[] array = new int[numero_array];
        	 int[] array2 = new int[numero_array];
        	 for (int i = 0; i < array.length; i++) {
      	        array[i] = crea_random(0,9);
      	    }
        	 array2 = array;
        	 for (int i = 0; i < array2.length; i++) {
      	        array2[i] = crea_random(0,9);
      	    }
        	int[] array3 = multiplica_arrays(array,array2);
        	System.out.println("Array1");
        	imprime_array(array);
        	System.out.println("Array2");
        	imprime_array(array2);
        	System.out.println("Array3");
        	imprime_array(array3);
        	 
         }else {
        	 System.out.print("Introduce numero valido");
         }
             
	        sc.close();
	    }
	 private static int crea_random(double min, double max) {
	        int random = (int) (min+Math.random()*(min-max));
	        return Math.abs(random);
	    }
	    public static void imprime_array(int[]array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println((i+1) + ": " + array[i]);
	        	}
	        }
	    public static int[] multiplica_arrays(int[]array1,int[]array2) {
	    	int[] array = new int[array1.length];
	        for (int i = 0; i < array.length-1; i++) {
	            array[i] =  array1[i]*array2[i+1];
	        	}
			return array;
	        }

}
