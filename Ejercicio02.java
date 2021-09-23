package ejerciciosArrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Leer 7 números y mostrarlos en orden inverso al introducido.
		
		int[] numeros = {1,3,5,7,9,11,13};
		
		for(int i=numeros.length-1; i>=0; i--) {
			System.out.println(numeros[i]);
		}

	}

}
