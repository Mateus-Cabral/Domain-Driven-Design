package aula_Construtores;

import java.util.Scanner;

public class TesteUsuario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Usuario user1 = new Usuario();
		
		System.out.println("Digite o usuário: ");
		user1.setUsuario(input.next());
		System.out.println("Digite a senha: ");
		user1.setSenha(input.nextInt());
		input.close();
		
		String user, usuario;
		int pwd, senha;
		
		usuario = user1.getUsuario();
		user = user1.getUser();
		senha = user1.getSenha();
		pwd = user1.getPwd();
		
		//System.out.println("Usuario local:" + usuario);
		
		boolean status = user1.validaUsuario(user, pwd, usuario, senha);
		user1.imprimeStatus(status);
		
	}

}
