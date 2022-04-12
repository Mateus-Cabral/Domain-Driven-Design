package exercicios_logica;

import java.util.Scanner;

public class EX_03 {
	
	// Exercício para ler 2 números inteiros e mostrar a soma, subtração, divisão e multiplicação deles
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.println("Digite o 1° valor: ");
		num_1 = input.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		num_2 = input.nextInt();
		
		input.close();
		
		System.out.println("Os números digitados foram " + num_1 +  " e " + num_2);
		System.out.println("Soma de " + num_1 + " e " + num_2 + " equivale a " + (num_1 + num_2));
		System.out.println("Subtração de " + num_1 + " e " + num_2 + " equivale a " + (num_1 - num_2));
		System.out.println("Multiplicação de " + num_1 + " e " + num_2 + " equivale a " + (num_1 * num_2));
		System.out.println("Divisão de " + num_1 + " e " + num_2 + " equivale a " + ((double) num_1 / num_2));
		
	}
	
	
}
