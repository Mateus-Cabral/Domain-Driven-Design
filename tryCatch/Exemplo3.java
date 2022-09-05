package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo3 {
	
	private int numerador, denominador, resultado;
	
	public static int calculaQuociente(int numerador, int denominador) throws ArithmeticException {
		return numerador/denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean fim = true;
		
		do {
			
			try {
				System.out.print("Númerador: ");
				int n1 = sc.nextInt();
				sc.nextLine();
				System.out.println("Denominador: ");
				int n2 = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Resultado: " + calculaQuociente(n1, n2));
			} catch (ArithmeticException e) {
				System.err.println("Impossível dividir por zero");
			} catch (InputMismatchException e) {
				System.err.println("Erro, apenas números aceitos");
				sc.nextLine();
				
			}
			
			try {
				System.out.println("Deseja continuar? [true - SIM | false - NAO]");
				fim = sc.nextBoolean();
				sc.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Erro, digite true ou false");
				sc.nextLine();
			}

		} while (fim);
		

		
		
		
	}
}
