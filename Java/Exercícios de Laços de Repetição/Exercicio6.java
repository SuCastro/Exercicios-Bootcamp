/* 6 - 	Escrever um programa que receba vários números inteiros no teclado. E no 
	final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).*/

package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio6 
{
	public static void main(String[] args) 
	{		
		int soma = 0,numDigit = 1,contador = 0;
		double media = 0;
		
		Scanner tec = new Scanner(System.in);		
		System.out.println("Para sair do programa digite 0!");
		
		do
		{
			System.out.print("Digite um número: ");
			numDigit = tec.nextInt();
			
			if(numDigit%3 == 0 && numDigit > 0) 
			{
				soma = soma + numDigit;
				contador = contador + 1;
			}
			
		}
		
		while(numDigit != 0);
		
		media = (soma/contador);
		System.out.printf("A média final é %.2f",media);
		
		tec.close();
	}
}
