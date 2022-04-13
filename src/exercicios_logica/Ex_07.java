package exercicios_logica;

import java.util.Scanner;

public class Ex_07 {

	// ler a idade em dias e mostrar expressa em anos e meses
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		int idadeDias = input.nextInt();
		input.close();
		
		int idadeMes = idadeDias / 30;
		int idadeAno = idadeMes / 12;
				
		System.out.println("Idade em anos: " + idadeAno);
		System.out.println("Idade em meses: " + idadeMes);
		
		
	}

}
