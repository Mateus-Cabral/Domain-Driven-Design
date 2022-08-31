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
	
	public int[][] criarMatriz(int[] vetor){
		System.out.println("*- Criar a Matriz -*");
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[vetor[0]][vetor[1]];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("matriz[%d][%d]: \n",i,j);
				matriz[i][j] = input.nextInt();
			}
		}
		return matriz;
	}
	
	public int obterNumero() {
		System.out.println("Obter número");
		Scanner input = new Scanner(System.in);
		System.out.println("Número: ");
		int n = input.nextInt();
		return n;
	}
	
	public int verificarOcorrencia(int n, int[][]  m) {
		System.out.println("*- Verificando as ocorrencias -*");
		int cont = 0;
		for(int i=0; i<m[i].length; i++) {
			for(int j=0; j<m[i].length; j++) {
				if(n == m[i][j]) {
					cont++;
				}
			}
		}
		return cont;
	}
	
	public void imprimirMatriz(int[][] matriz) {
		System.out.println("Imprimndo a matriz");
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.printf("Elemento na posição [%d][%d] é %d /n", i, j, matriz[i][j]);
			}
		}
		
	}
	
	// TODO
	// Método: Obter os índices das ocorrências
	// Método: Imprimir as ocorrências
	
	// Poderia estar numa classe teste
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ExemploMatrizesMetodos emm = new ExemploMatrizesMetodos();
		int[] v = emm.tamanhoMatriz();
		int[][] m = emm.criarMatriz(v);
		emm.imprimirMatriz(m);
	}
	
}
