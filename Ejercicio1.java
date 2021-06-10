import java.util.*;

public class Ejercicio1{
	public static void main (String[] args){
		
		int num1;
		Scanner leer = new Scanner(System.in);
		int par=0;
		int impar=0;

		//pedir el primer numero  
		System.out.println("\nIngrese la cantidad de numeros: ");
		num1 = leer.nextInt();

		// ciclo for
		for (int i=1;i<num1 ;i++ ) {
			int numero = (int)(Math.random()*1000+1);

			if ((numero % 2)==0){
				par = par + 1 ;
			}else{
				impar =impar +1;
			}
		}
		System.out.println("Los numeros pares son: "+ par);
		System.out.println("Los numeros impares son: " + impar);
	}
}	