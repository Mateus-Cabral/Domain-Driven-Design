package exercicios_logica;

import java.util.Scanner;

public class Ex_04 {
	
	// Exerc�cio para ler 2 n�meros inteiros e mostrar sua divis�o

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.println("Digite o 1� inteiro: ");
		num_1 = input.nextInt();
		
		System.out.println("Digite o 2� inteiro: ");
		num_2 = input.nextInt();
		
		input.close();
		
		double div = (double) num_1 / num_2;
		System.out.println("A divis�o de " + num_1 + " e " + num_2 + " equivale a " + div);

	}

}
