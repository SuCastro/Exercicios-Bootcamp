/* 4 - 	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas
	dos indivíduos de uma região. Para tanto, a cada uma das pessoas era
	perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as 
	opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
	era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
	150 pessoas, calcule e mostre:

	-número de pessoas calmas; 
	-número de mulheres nervosas; 
	-número de homens agressivos; 
	-número de outros calmos;
	-número de pessoas nervosas com mais de 40 anos; 
	-número de pessoas calmas com menos de 18 anos. */

package LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio4 {

	private static Scanner clear;

	public static void main(String[] args) 
	{		
		Scanner leia = new Scanner(System.in);
				
		int idade;
		final int LIMITE = 3; // O LIMITE DE PESSOAS É 150
		byte sexo; // (1-feminino / 2-masculino / 3-Outros)
		byte tipoHumor; 
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0, calmasMenor18=0;
		
		int contador = 1;
		System.out.println("------- SISTEMA DE PESQUISA DA CIDADE DE EMBU -----------------");
		while (contador <=LIMITE) {
			System.out.print("Digite a sua idade:");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros :");
			sexo = leia.nextByte();
			System.out.print("Digite para cada tipo de pessoa: 1 - Calma / 2 - Nervosa / 3 - Agressiva :");
			tipoHumor = leia.nextByte();
			leia.nextLine();
								
			if (tipoHumor == 1) 
			{pessoasCalmas = pessoasCalmas + 1;}
			
			if ((tipoHumor ==2) && (sexo == 1)) 
			{mulheresNervosas = mulheresNervosas +1;}
			
			if ((tipoHumor ==3) && (sexo == 2)) 
			{homensAgressivos = homensAgressivos +1;}
			
			if ((tipoHumor ==1) && (sexo == 3)) 
			{outrosCalmos = outrosCalmos +1;}
			
			if ((tipoHumor ==2) && (idade > 40)) 
			{nervosas40 = nervosas40 +1;}
			
			if ((tipoHumor ==1) && (idade < 18)) 
			{calmasMenor18 = calmasMenor18 +1;}
			
			contador++;
			
		}
		
		System.out.printf("\nTOTAL DE PESSOAS CALMAS : %d", pessoasCalmas);
		System.out.printf("\nTOTAL DE MULHERES NERVOSAS : %d", mulheresNervosas);
		System.out.printf("\nTOTAL DE HOMENS AGRESSIVOS : %d", homensAgressivos);
		System.out.printf("\nTOTAL DE OUTROS CALMOS : %d", outrosCalmos);
		System.out.printf("\nTOTAL DE PESSOAS NERVOSAS COM MAIS DE 40 ANOS : %d", nervosas40);
		System.out.printf("\nTOTAL DE PESSOAS CALMAS COM MENOS DE 18 ANOS : %d", calmasMenor18);
		leia.close();
		
	}
}
