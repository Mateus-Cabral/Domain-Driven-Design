package aulaRepeticao;

public class While {

	public static void main(String[] args) {
		//Declara��o de vari�veis
		String nome = "Jos�";
		double salario = 1500;
		int contador = 0;

		System.out.println("Funcion�rio: " + nome);
		System.out.println("Sal�rio :" + salario);
		
		// Aumenta o sal�rio em 10% ap�s cada itera��o
		// Sintaxe de while:
		// while(<teste>){
		// 	Bloco
		// }
		while (salario < 5000) {
			salario = salario + (salario * 0.1);
			//Sintaxe de incremento
			contador++;
		}
		
		// prinf - print com formata��o
		// %s - String
		// %c - caractere
		// %d - int
		// %f - %.2f (controla n�mero de casas) - float
		// Sintaxe:
		// printf("<%s, %c, %d, %.1f>", <string>,<char>,<int>,<float>)
		
		System.out.printf("%s, seu sal�rio final � de: R$ %.2f \n", nome, salario);
		System.out.printf("Vezes que o loop ocorreu: %d meses \n", contador);
		
	}

}
