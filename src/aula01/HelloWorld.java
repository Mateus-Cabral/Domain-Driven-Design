package aula01;


// Exemplo de coment�rio em uma linha

/* Exemplo
 * de
 * coment�rio
 * de v�rias
 * linhas
 */


public class HelloWorld {
	public static void main(String[] args) {
		byte idade = 19;
		double peso = 65;
		String nome = "Hairo Newdawn";
		/* Declara��o de var - <tipo> <nome_var> = <valor_var>
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
		/* System - Dom�nio do Comando
		*  Out - Sa�da
		*  print - Comando de Print
		*  println - Print com linha ap�s
		*/
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		System.out.println("Peso: " + peso);
		// Concatena��o em Java se usa o + e n�o o ,
	}
}
