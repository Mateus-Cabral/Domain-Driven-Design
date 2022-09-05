package tryCatch;

import java.util.Random;

public class Exemplo2 {
	public static void main(String[] args) {
		int a=0, b=0;
		double c = 0;
		Random r = new Random();
		
		for (int i=0; i < 100; i++) {
			try {
				a = r.nextInt(5);
				b = r.nextInt(5);
				System.out.printf("a: %d | b: %d \n", a, b);
				c = (double) (a / b);
				System.out.println("Resultado: " + c);
			} catch (ArithmeticException e) {
				System.out.println("Divisao por zero");
				e.printStackTrace();
			} finally {
				System.out.println("Fim do try catch, sempre passa aqui");
			}
		}
		
	}
}
