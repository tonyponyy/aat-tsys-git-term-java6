package unidad_6;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que numero sacamos el factorial?");
        int num = sc.nextInt();
        System.out.print("Resultado :"+factorial(num));
        sc.close();
    
}
	private static int factorial(int n) {
		int resultado = 1;
		for (int i = n; i > 1; i--) {
			resultado*=i;
        }
		return resultado;
	   
	}
	   
	

}
