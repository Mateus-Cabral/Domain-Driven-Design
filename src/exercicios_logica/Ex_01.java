package exercicios_logica;

import java.util.Scanner;

public class Ex_01 {
	
	// Exerc�cio para ler o 1 n�mero inteiro e mostrar seu antecessor e seu sucessor
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um valor: ");
		num = input.nextInt();
		
		input.close();
		
		System.out.println("O n�mero � " + num);
		System.out.println("Seu antecessor �: " + (num - 1));
		System.out.println("O seu sucessor � " + (num + 1));
	}

}
