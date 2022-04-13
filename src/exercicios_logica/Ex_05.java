package exercicios_logica;

import java.util.Scanner;

public class Ex_05 {
	
	// Exercício para ler uma idade e mostre essa idade em meses
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = input.nextInt();
		input.close();
		
		int idadeMeses = idade * 12;
		System.out.println("Sua idade em meses equivale a " + idadeMeses);
		
	}
}
