package sv.edu.udb.ejercicio_5;

import javax.swing.JOptionPane;

public class Ejercicio5 {
public static void main(String[] args) {
	
	
	
	float sells = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese sus ventas del dia de ahora: "));
	
	
	if (sells <= 100) {
		JOptionPane.showMessageDialog(null, "Hoy no hay comision pa usted, vuelva pronto :)");
	}else if (sells == 100 || sells <= 200) {
		JOptionPane.showMessageDialog(null, "trabaje mas duro compa, solo se gano el 3%"+ "\n"+((sells*3)/100)+" dolaritos de comision");
	}else if (sells == 200 || sells <= 400) {
		JOptionPane.showMessageDialog(null, "trabaje mas duro compa, solo se gano el 6%"+ "\n"+((sells*6)/100)+" dolaritos de comision");
	}else if (sells >= 400) {
		JOptionPane.showMessageDialog(null, "Master, crack, maquina, mastodonte, megalodon , se gano el 10%"+ "\n"+((sells*10)/100)+" dolaRicos, disfrute compa");
	}
}
}
