package ejerciciosArrays;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*3. Leer 10 números enteros. Debemos mostrarlos en 
		 * el siguiente orden: el primero, el último, el segundo, 
		 * el penúltimo, el tercero, etc. */
		
		int[] numeros = {2,4,6,8,10,12,14,16,18,20};
		
		int contador = 0;
		
		for(int i=numeros.length-1; i>=0; i--) {
			System.out.println(numeros[contador]);
			contador++;
			
			System.out.println(numeros[i]);
		}
		
		
		 
	}

}
