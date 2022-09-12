package exceptions;

import java.util.Scanner;

public class TesteException {
	
	public static String pegaLetra() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite uma letra: ");
		String msg = input.next();
		input.close();
		return msg;
	}
	
	public static void verificaLetra(String msg) throws VerificaLetraException{
		if(msg.equals("aaa")) {
			throw new VerificaLetraException();
		}
	}

	public static void main(String[] args){
		try {
			verificaLetra(pegaLetra());
		} catch(VerificaLetraException e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("Programa finalizado");
		}		
	}

}
