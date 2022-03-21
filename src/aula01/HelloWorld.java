package aula01;


// Exemplo de comentário em uma linha

/* Exemplo
 * de
 * comentário
 * de várias
 * linhas
 */


public class HelloWorld {
	public static void main(String[] args) {
		byte idade = 19;
		double peso = 65;
		String nome = "Hairo Newdawn";
		/* Declaração de var - <tipo> <nome_var> = <valor_var>
		*  Byte   - Int de 8  Bits
		*  Shot   - Int de 16 Bits
		*  Int    - Int de 32 Bits
		*  Long   - Int de 64 Bits
		* 
		*  Float  -  . flutuante de 32 Bits
		*  Double - . flutuante de 64 Bits
		*  
		*  Char - Caractere unicode de 16 Bits - Tem que ser 'a'
		*  String - Cadeia de char - Se usa "ab"
		*  
		*  Boolean - True or False
		*/
		
		System.out.println("Hello World");
		/* System - Domínio do Comando
		*  Out - Saída
		*  print - Comando de Print
		*  println - Print com linha após
		*/
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		// Concatenação em Java se usa o + e não o ,
	}
}
