package aulaRepeti�ao;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		// Sintaxe do Switch/Case:
		// switch(<var>)
		// {
		// case <valor>:  -caso o valor seja digitado, apenas esse bloco vai ser executado
		//     Bloco;
		// 	   break;
		// case <valor 2>:  -caso o valor 2 seja digitado, todos os blocos abaixo ser�o executados
		//     Bloco
		// case <valor 3>:  -caso o valor 3 seja digitado, todos os blocos abaixo ser�o executados
		//     Bloco
		// case <valor 4>:  -caso o valor 4 seja digitado, apenas esse bloco ser� executado
		//     Bloco
		// }
		
		Scanner input = new Scanner(System.in);

		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda-feira");
		System.out.println("3 - Ter�a-feira");
		System.out.println("4 - Quarta-feira");
		System.out.println("5 - Quinta-feira");
		System.out.println("6 - Sexta-feira");
		System.out.println("7 - S�bado");
		
		int escolha = input.nextInt();
		
		
		while(escolha > 7 || escolha < 1) {
			System.out.println("Valor inv�lido, tente novamente.");
			escolha = input.nextInt();
		}
		
		input.close();
		
		switch(escolha)
		{
		case 1:
			System.out.println("Voc� escolheu Domingo!");
			break;
			
		case 2:
			System.out.println("Voc� escolheu Segunda-feira!");
			break;
			
		case 3:
			System.out.println("Voc� escolheu Ter�a-feira!");
			break;
			
		case 4:
			System.out.println("Voc� escolheu Quarta-feira!");
			break;
			
		case 5:
			System.out.println("Voc� escolheu Quinta-feira!");
			break;
			
		case 6:
			System.out.println("Voc� escolheu Sexta-feira!");
			break;
			
		case 7:
			System.out.println("Voc� escolheu S�bado!");
			break;
		}
		
	}

}
