package exercicios_logica;

import java.util.Scanner;

public class Ex_04 {
	
	// Exercício para ler 2 números inteiros e mostrar sua divisão

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.println("Digite o 1° inteiro: ");
		num_1 = input.nextInt();
		
		System.out.println("Digite o 2° inteiro: ");
		num_2 = input.nextInt();
		
		input.close();
		
		double div = (double) num_1 / num_2;
		System.out.println("A divisão de " + num_1 + " e " + num_2 + " equivale a " + div);

	}

}
