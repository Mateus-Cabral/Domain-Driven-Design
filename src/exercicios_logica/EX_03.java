package exercicios_logica;

import java.util.Scanner;

public class EX_03 {
	
	// Exerc�cio para ler 2 n�meros inteiros e mostrar a soma, subtra��o, divis�o e multiplica��o deles
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.println("Digite o 1� valor: ");
		num_1 = input.nextInt();
		
		System.out.println("Digite o 2� valor: ");
		num_2 = input.nextInt();
		
		input.close();
		
		System.out.println("Os n�meros digitados foram " + num_1 +  " e " + num_2);
		System.out.println("Soma de " + num_1 + " e " + num_2 + " equivale a " + (num_1 + num_2));
		System.out.println("Subtra��o de " + num_1 + " e " + num_2 + " equivale a " + (num_1 - num_2));
		System.out.println("Multiplica��o de " + num_1 + " e " + num_2 + " equivale a " + (num_1 * num_2));
		System.out.println("Divis�o de " + num_1 + " e " + num_2 + " equivale a " + ((double) num_1 / num_2));
		
	}
	
	
}
