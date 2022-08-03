package aula_Matrizes;

import java.util.Scanner;

public class ExemploMatrizesMetodos {
	
	public int[] tamanhoMatriz() {
		System.out.println("Tamanho da matriz");
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[2];
		System.out.println("Digite o número de linhas: ");
		vetor[0] = input.nextInt();
		System.out.println("Digite o número de colunas: ");
		vetor[1] = input.nextInt();
		input.close();
		return vetor;
	}
	
	public int[][] criaMatriz(int[] vetor) {
		System.out.println("Criação da matriz");
		int[][] matriz = new int[vetor[0]][vetor[1]];
		return matriz;
	}
	
}
