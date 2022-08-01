package aulaRevisao;

import java.util.Scanner;

public class Exemplo1 {
	
	public int tamanhoVetor(){
		Scanner input = new Scanner(System.in);
		System.out.println("Tamanho: ");
		int t = input.nextInt();		
		input.close();
		return t;
	}
	
	public int entradaNumero(){
		Scanner input = new Scanner(System.in);
		System.out.println("Numero: ");
		int n = input.nextInt();		
		input.close();
		return n;
	}
	
	public int[] criaVetor(int t) {
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[t];
		for(int i = 0; i<vetor.length; i++) { 
			System.out.println("Números Listados: ");
			vetor[i] = input.nextInt();
		}
		return vetor;
	}
	
	public boolean buscaElemento(int[] vetor, int num1) {
		boolean achado = false;
		for(int i = 0; i < vetor.length; i++) {
			if(num1 == vetor[i]) {
				achado = true;
			}
		}
		return achado;
	}
	
	public void imprimirStatus(int num1, boolean status) {
		if(status) {
			System.out.printf("O número %d foi encontrado.", num1);
		}	else {
			System.out.printf("O número %d não foi encontrado", num1);
		}
	}
	
	public static void main(String[] args) {
		Exemplo1 m = new Exemplo1();
		int t = m.tamanhoVetor();
		int[] v = m.criaVetor(t);
		int n = m.entradaNumero();
		boolean status = m.buscaElemento(v, m.entradaNumero());
		m.imprimirStatus(n, status);
	}
}
