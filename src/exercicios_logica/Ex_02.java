package exercicios_logica;

import java.util.Scanner;

public class Ex_02 {

	// Exercício para ler 2 números inteiros e mostrar seus sucessores
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.println("Digite o 1° valor: ");
		num_1 = input.nextInt();
		
		System.out.println("Digite o 2° valor: ");
		num_2 = input.nextInt();
		
		input.close();
		
		System.out.println("O primeiro número digitado foi " + num_1 + " e seu sucessor é " + (num_1 + 1));
		System.out.println("O segundo número digitado foi " + num_2 + " e seu sucessor é " + (num_2 + 1));

	}

}
