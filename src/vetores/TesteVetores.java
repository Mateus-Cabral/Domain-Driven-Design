package vetores;

import java.util.Scanner;

public class TesteVetores {
	
	public static void main(String[] args) {
		int tamanho = 10;
		int totPar = 0;
		int maiorZero = 0;
		//<tipo do vetor>[] <nome do vetor> = new <tipo do vetor>[<tamanho>]
		int[] v = new int[tamanho];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<tamanho; i++) {
			System.out.printf("Vetor[%d]: \n", i);
			v[i] = input.nextInt();
			
			if(v[i] % 2 == 0) {
				totPar++;
			}
			
			if(v[i] > 0) {
				maiorZero++;
			}
			
		}
		
		for(int i=0; i<tamanho; i++) {
			System.out.printf("Vetor[%d]: %d\n", i, v[i]);
		}
		

		System.out.println("Total de pares: " + totPar);
		System.out.println("Total de positivos:  " + maiorZero);

		
		input.close();
		
		
		
	}

}
