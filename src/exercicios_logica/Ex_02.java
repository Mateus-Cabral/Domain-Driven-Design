package exercicios_logica;

import java.util.Scanner;

public class Ex_02 {

	// Exerc�cio para ler 2 n�meros inteiros e mostrar seus sucessores
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num_1, num_2;
		
		System.out.println("Digite o 1� valor: ");
		num_1 = input.nextInt();
		
		System.out.println("Digite o 2� valor: ");
		num_2 = input.nextInt();
		
		input.close();
		
		System.out.println("O primeiro n�mero digitado foi " + num_1 + " e seu sucessor � " + (num_1 + 1));
		System.out.println("O segundo n�mero digitado foi " + num_2 + " e seu sucessor � " + (num_2 + 1));

	}

}
