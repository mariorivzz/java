package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 4. Crear un programa que lea por teclado una 
		 * tabla de 10 números enteros y la desplace una 
		 * posición hacia abajo: el primero pasa a 
		 * ser el segundo, el segundo pasa a ser el
		 *  tercero y así sucesivamente. El último pasa
		 *   a ser el primero */
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 0; i < 10; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Inicio del array: ");
		
		int ultimo = numeros[numeros.length-1];
		
		System.out.println(ultimo);
		for(int i=1; i<9;i++) {
			System.out.println(numeros[i]);
			}
		
	}

}
