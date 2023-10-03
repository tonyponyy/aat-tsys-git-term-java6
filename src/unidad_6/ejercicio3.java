package unidad_6;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Que numero evaluamos si es primo?");
		        int num = sc.nextInt();
		        if (es_primo(num)) {
		        	System.out.print("Es primo");
		        }else {
		        	System.out.print("No es primo");
		        }
		        sc.close();
		    
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


