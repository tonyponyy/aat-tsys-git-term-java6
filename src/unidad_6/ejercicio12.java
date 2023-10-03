package unidad_6;

import java.util.Scanner;

public class ejercicio12 {
	static Scanner sc = new Scanner(System.in);
	static int ultimo_numero;

	public static void main(String[] args) {
		System.out.print("Introduce tamaño de array");
		if (sc.hasNextInt()) {
			int numero_array = sc.nextInt();
			int[] array = new int[numero_array];
			for (int i = 0; i < array.length; i++) {
				array[i] = crea_random(1, 300);
			}
			System.out.print("Introduce el ultimo digito que quieres ver :");
			if (sc.hasNextInt()) {
				ultimo_numero = sc.nextInt();
				imprime_array_ultimo_num(array);
			} else {
				System.out.print("Introduce numero valido");
			}

		} else {
			System.out.print("Introduce numero valido");
		}

		sc.close();
	}

	private static int crea_random(double min, double max) {
		int random = (int) (min + Math.random() * (min - max));
		return Math.abs(random);
	}

	public static void imprime_array_ultimo_num(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]%10 == ultimo_numero) {
				System.out.println((i + 1) + ": " + array[i]);
			}
		}
	}

}
