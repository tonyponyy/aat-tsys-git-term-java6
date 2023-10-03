package unidad_6;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que numero contamos las cifras?");
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            System.out.println("Tiene: " + cuentacifras(numero)+ " caracteres");
        } else {
            System.out.println("No ha ingresado un número entero válido.");
        }
       
        sc.close();
    
}
	private static int cuentacifras(int n) {
		int cuenta = Integer.toString(n).length();
		return cuenta;
	   
	}
	   
	

}