package exercicios_logica;

import java.util.Scanner;

public class Ex_06 {

	// Exercício para ler uma idade e mostre em meses e dias
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = input.nextInt();
		input.close();
		
		int idadeMeses = idade * 12;
		int idadeDias = idadeMeses * 30;
		
		System.out.println("Você digitou " + idade + " anos");
		System.out.println("Isso daria..." + System.lineSeparator() +
							"Meses: " + idadeMeses + System.lineSeparator() +
							"Dias: " + idadeDias + System.lineSeparator());
	}

}
