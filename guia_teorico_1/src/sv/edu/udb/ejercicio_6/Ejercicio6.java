package sv.edu.udb.ejercicio_6;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {

		int num = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del cual quiere el factorial: "));
		int fact = 1;

		if (num != 0 && num >= 1) {
			for (int i = 1 ; i <= num; i++) {
				fact = fact * i;
			}
			JOptionPane.showMessageDialog(null,"El factorial del n�mero " + Integer.toString(num) + " es " + Integer.toString(fact));
		} else {
			JOptionPane.showMessageDialog(null, "Porfavor ingrese un numero positivo");

		}

	}

}
