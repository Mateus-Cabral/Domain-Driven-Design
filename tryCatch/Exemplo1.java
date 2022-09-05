package tryCatch;

public class Exemplo1 {

	public static void main(String[] args) {
		// tratamento de erros, não deixa a aplicação crashar e devolve uma mensagem/algo para identificar o erro
		
		int a, b, result;
		
		// try {
		// bloco principal | bloco correto
		// } catch(nome de exceção) {
		// mensagem de erro }
		
		try {
			a = 42;
			b = 0;
			result = a/b;
			
			System.out.println("Resultado: " + result);
			
		} catch (ArithmeticException e) { // e de exception
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace().toString());
			System.err.println("Erro aleatorio sla");
		
		} finally {
			System.out.println("Fim");
		}
		
		System.out.println("Fora do trycatch");
		

	}

}
