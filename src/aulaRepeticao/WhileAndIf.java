package aulaRepeticao;

public class WhileAndIf {

	public static void main(String[] args) {
		int i = 200;
		int f = 100;
		
		// Sintaxe if-else:
		// if(<Teste>){
		// 	   Bloco 1
		// } else {
		//     Bloco 2
		// }
		
		if (i < f) {
			System.out.printf("O valor de %d deve ser maior que %d \n", f, i);
			
		} else {
			
			while(i >= f) {
				System.out.printf("i: %d \n", i);
				i--;
			}
		}	
		
		System.out.println("Fora do While");
		
	}

}
