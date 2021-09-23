package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 5. Queremos desarrollar una aplicación que nos 
		 * ayude a gestionar las notas de un centro educativo.
		 * Cada grupo (o clase) está compuesto por 5 
		 * alumnos. Se pide leer las notas del primer, 
		 * segundo y tercer trimestre de un
		 * grupo. Debemos mostrar al final: la nota media
	   	 * del grupo en cada trimestre, y la media del
	   	 * alumno que se encuentra en la posición N 
	   	 * (N se lee por teclado). 
	   	 */
		
		Scanner sc = new Scanner(System.in);
		
		double[][] clase = {{1,2,4,5,2},{5,4,7,8,9},{7,8,6,5,9}};
		
		for(int i=0; i<clase.length; i++) {
			for(int j=0; j<clase[i].length; j++) {
				System.out.println(clase[i][j]);
			}
		}
		
		double notaTrimestre1 = ((clase[0][0]+clase[0][1]+
				clase[0][2]+clase[0][3]+clase[0][4])/5);
		
		double notaTrimestre2 = ((clase[1][0]+clase[1][1]+
				clase[1][2]+clase[1][3]+clase[1][4])/5);
		
		double notaTrimestre3 = ((clase[2][0]+clase[2][1]+
				clase[2][2]+clase[2][3]+clase[2][4])/5);

		System.out.println("Nota media trimestre 1: "+notaTrimestre1);
		System.out.println("Nota media trimestre 2: "+notaTrimestre2);
		System.out.println("Nota media trimestre 3: "+notaTrimestre3);
		
		System.out.println("De que alumno deseas saber la nota media?");
		
		int numeroIntroducido = sc.nextInt();
		
		
		System.out.println("Notas del alumno: " + numeroIntroducido);
		
		numeroIntroducido=+1;
		
		for(int i=0; i<clase.length; i++) {
			for(int j=0; j<clase[i].length;j++) {
			}
			System.out.println(clase[i][numeroIntroducido]);
		}
		
	}

}
