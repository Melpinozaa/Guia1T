package sv.edu.udb.ejercicio_7;

import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static void main(String[] args) {

		int num = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Ingrese el numero del que quiere su tabla de multiplicar:"));
		String output = "";

		if (num <= 1000) {
			for (int i = 1; i <= 10; i++) {
				output += num + " x " + i + " = " + num * i + "\n";
			}

			JOptionPane.showMessageDialog(null, output, "Result", 3);
		} else {
			JOptionPane.showMessageDialog(null, "Por favor Ingrese un numero menor a 1000", "Result", 3);
		}

	}
}
