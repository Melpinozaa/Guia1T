package sv.edu.udb.ejercicio_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		int average = 0;
		int zeros = 0;

		int num = Integer
				.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros que desea operar"));

		int numbers[] = new int[num];
		int sum = 0;
		String outputdata = "";
		String outputhighest= "";
		String outputzero = "";
		
		int highest = 0;
		
		
		for (int i = 0; i < numbers.length; i++) {
			//get array "numbers"
			numbers[i] = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Ingrese su numero " + (i + 1) + " ", "Numero"));
			//var to print the array "numbers"
			outputdata += "Num " + (i + 1) + " -      " + numbers[i] + "\n";
			sum = sum + numbers[i];
			
		}

		
//		if (i > highest) {
//			highest = i;
//			
//		}	
		//Get average
		average = sum / numbers.length;
	
		int posCount = 0;
	    int negCount = 0;
	    int positive[] = null;
	    int negative[] = null;
	    
	    for (int i : numbers) {
	        if (i >= 0)
	          ++posCount;
	        else
	          ++negCount;
	      }
	    
	    positive = new int[posCount];
	    negative = new int[negCount];
	    
	    int i = 0;
	    int j = 0;

		
		for(int numb : numbers) { 
			if (numb >= 0) {
				positive [i++] = numb; 
			}else {
		        negative[j++] = numb;
		      }
		}
		
		String outputlower= "";
		int lowest = 0;
		
		for (int index1 : negative) {
			if (index1 > lowest) {
				lowest = index1;
				
			}	
			outputlower += "El numero negativo mas alto es"+ lowest ;	
			
			
		}
		
		
		
		JOptionPane.showMessageDialog(null, "Datos del arreglo" + "\n" + "\n" + outputdata + "\n" + "\n"
				+ "El Promedio de los numeros ingresados es: " + "\n" + average+"\n"+"El Mayor de los valores positivos ingresados: "+ "\n" + highest
				+"\n"+"El Mayor de los valores negativos ingresados: "+ "\n" + outputlower + "\n" + "\n"
				, "Result", 3);
		
		/*for (int i : numbers) {
			
			if (num==0) {
				zeros++;
				outputzero += "El numero cero esta en la posicion: "+ (i+1) ;
			}else {
				outputzero += "No hay ceros en el listado ingresado"  ;
			}*/
			
		}


	}


