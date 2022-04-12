package exercicios_logica;

import java.util.Scanner;

public class Ex_01 {
	
	// Exercício para ler o 1 número inteiro e mostrar seu antecessor e seu sucessor
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um valor: ");
		num = input.nextInt();
		
		input.close();
		
		System.out.println("O número é " + num);
		System.out.println("Seu antecessor é: " + (num - 1));
		System.out.println("O seu sucessor é " + (num + 1));
	}

}
