package unidad_6;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce cantidad de euros");
		if (sc.hasNextInt()) {
			int numero = sc.nextInt();
			System.out.println("Introduce moneda a la que pasar ( 1->libras 2->dolares 3-> yenes)");
			if (sc.hasNextInt()) {
				int moneda = sc.nextInt();
				if (moneda == 1 || moneda == 2 || moneda == 3) {
					System.out.println(numero + "€ son:" + cambio_divisa(numero, moneda));
				} else {
					System.out.println("No ha ingresado un número entero válido.");
				}
			} else {
				System.out.println("No ha ingresado un número entero válido.");
			}
		} else {
			System.out.println("No ha ingresado un número entero válido.");
		}

		sc.close();

	}

	private static String cambio_divisa(int n, int m) {
		String resultado = "";
		switch (m) {
		case 1:
			resultado = (n * 0.86) + " Libras";
			break;
		case 2:
			resultado = (n * 1.28611) + " Dolares";
			break;
		case 3:
			resultado = (n * 129.852) + " Yenes";
			break;
		}
		return resultado;

	}

}