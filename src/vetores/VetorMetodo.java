package vetores;

import java.util.Scanner;

public class VetorMetodo {
	
	public int tamanhoVetor() {
		System.out.println("----Tamanho do Vetor----");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o tamanho desejado: ");
		int tamanho = input.nextInt();
		input.close();
		
		return tamanho;
	}
	
	public int[] criaVetor(int tamanho) {
		int[] vetor = new int[tamanho];
		return vetor;
	}
	
	public int[] populaVetor(int[] vetor) {
		System.out.println("----Popula o Vetor");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = i;
		}
		
		return vetor;
	}
	
	public void getVetor(int[] vetor) {
		System.out.println("---Mostrando o vetor----");
		for(int i=0; i<vetor.length; i++) {
			System.out.printf("Vetor[%d]: %d \n", i, vetor[i]);
		}
		
	}
	
	public static void main(String[] args) {
		VetorMetodo vetor = new VetorMetodo();
		vetor.getVetor(vetor.populaVetor(vetor.criaVetor(vetor.tamanhoVetor())));;
		
	}
}
