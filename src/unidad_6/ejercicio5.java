package unidad_6;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que numero covertimos a binario?");
        int num = sc.nextInt();
        System.out.print("Resultado :"+pasar_a_binario(num));
        sc.close();
    
}
	private static String pasar_a_binario(int n) {
		String resultado= "";
		while(n>0) {
		resultado = (n%2)+ resultado;
		n = n/2;	
		}
		return resultado;
	   
	}
	   
	

}
