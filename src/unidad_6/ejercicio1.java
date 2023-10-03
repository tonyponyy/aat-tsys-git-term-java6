package unidad_6;

import javax.swing.JOptionPane;

public class ejercicio1 {
	public static void main(String[] args) {
		String menu_option = JOptionPane.showInputDialog("Que figura quieres calcular ? 1 -> circulo 2-> triangulo 3->cuadrado.");
		switch(menu_option) {
		  case "1":
		    calcula_circulo();
		    break;
		  case "2":
		    calcula_triangulo();
		    break;
		  case "3":
		    calcula_cuadrado();
		    break;
		  default:
			  JOptionPane.showMessageDialog(null,"Elige un numero correcto");
		}
		

	}

	private static void calcula_circulo() {
		String num_option1 = JOptionPane.showInputDialog("Introduce el radio");
		Double num1 = Double.parseDouble(num_option1);
		JOptionPane.showMessageDialog(null,"Resultado :"+(num1*num1)*Math.PI);
		
	}
	private static void calcula_triangulo() {
		String num_option1 = JOptionPane.showInputDialog("Introduce base");
		Double num1 = Double.parseDouble(num_option1);
		String num_option2 = JOptionPane.showInputDialog("Introduce altura");
		Double num2 = Double.parseDouble(num_option1);
		JOptionPane.showMessageDialog(null,"Resultado :"+(num1*num2)/2);
	}
	private static void calcula_cuadrado() {
		String num_option1 = JOptionPane.showInputDialog("Introduce la longitud del lado");
		Double num1 = Double.parseDouble(num_option1);
		JOptionPane.showMessageDialog(null,"Resultado :"+(num1*num1));
	}

}
