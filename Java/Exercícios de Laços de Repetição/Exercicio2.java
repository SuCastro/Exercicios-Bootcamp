/* 1 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. */

package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
	{	
		int n=0, par= 0, impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Entre com dez números: ");
			n = ler.nextInt();
		
			if(n%2==0) 
			{
				par++;
			}
		
			else
			{
				impar++;
			}
		}	
		System.out.printf("%d números são pares e %d números são impares",par, impar);
	}
}
