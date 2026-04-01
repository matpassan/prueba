/*
 
  escribe un metodo que retorne un array de 100 num enteros generados aleatoriamente
 
 * */

public class ACT81 {
	public static void main(String[] args) {
		int num=100;
		int array [] = num(num);
		calcular(array,num);
	}
	
	private static void calcular(int [] array, int num) {
		int numero=0;
		boolean hola;
		System.out.println("");
		System.out.println("");
		int sumar=0;
		java.util.Arrays.sort(array);
		
		for(int i=0;i<num;i++) {
			System.out.print(array[i]+ "  ");
		}
		
		for(int i=0;i<num;i++) {
			sumar= array[i] + numero;
			numero=array[i] + numero;
		}
		System.out.println("");
		System.out.println("");
		for(int i=num-1;i>0;i--) {
	
			System.out.print(array[i]+ "  ");
		}
		
		System.out.println("");
		System.out.println("SUMA DE TODOS LOS DIGITOS: "+sumar);	
	}
	
	
	
	
	private static int [] num(int array ) {
		double numeroaleatorio =0;
		int num2 =0;
		int arraynumeros[] = new int[array];
		
		for(int i=0;i<array;i++){
			numeroaleatorio = Math.random()*100;
			num2 = (int) numeroaleatorio;
			arraynumeros[i]=num2;
			System.out.print(arraynumeros[i]+ "  ");
		}
		return arraynumeros;
	}
	/*
	 
	  escribe un metodo que reciba el array generado en la actividad 
	  propuesta 8.1 y lo recorra en orden decreciente, calculando el 
	  sumario de tdos los numeros del array y mostrando finalente 
	  dicho valor por pantalla
	 
	  */


	
}
