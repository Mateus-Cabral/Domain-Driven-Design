package aulaRepetiçao;

public class While {

	public static void main(String[] args) {
		//Declaração de variáveis
		String nome = "José";
		double salario = 1500;
		int contador = 0;

		System.out.println("Funcionário: " + nome);
		System.out.println("Salário :" + salario);
		
		// Aumenta o salário em 10% após cada iteração
		// Sintaxe de while:
		// while(<teste>){
		// 	Bloco
		// }
		while (salario < 5000) {
			salario = salario + (salario * 0.1);
			//Sintaxe de incremento
			contador++;
		}
		
		// prinf - print com formatação
		// %s - String
		// %c - caractere
		// %d - int
		// %f - %.2f (controla número de casas) - float
		// Sintaxe:
		// printf("<%s, %c, %d, %.1f>", <string>,<char>,<int>,<float>)
		
		System.out.printf("%s, seu salário final é de: R$ %.2f \n", nome, salario);
		System.out.printf("Vezes que o loop ocorreu: %d meses \n", contador);
		
	}

}
