package La�osDeRepeti��o;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
	{// 1 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		
		int n=0, par= 0, impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			
			System.out.println("Entre com dez n�meros: ");
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
		System.out.printf("%d n�meros s�o pares e %d n�meros s�o impares",par, impar);
	}
}