package aula_Construtores;

public class Usuario {
	
	// atributos da classe Usu�rio
	private String usuario; // Usu�rio define
	private String user; // "Armazenado" no BD
	private int senha; // Usu�rio define
	private int pwd; // "Armazenado" no BD
	
	//Construtor
	public Usuario() {
		
		System.out.println("Construtor Usu�rio");
		
		user = "Teste123";
		pwd = 123;
	}
	
	public boolean validaUsuario(String user, int pwd, String usuario, int senha) {
		
		System.out.println("Valida��o de usu�rio");
		
		if (user.equals(usuario) && (pwd == senha)){
			return true;
		} else {
			return false;
		}
		
	}
	
	public void imprimeStatus(boolean status) {
		
		System.out.println("Imprime Status");
		
		if(status == true) {
			System.out.println("Login efetuado com sucesso!");
		} else {
			System.out.println("Login ou senha inv�lidos. Tente novamente...");
		}
		
	}
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getPwd() {
		return pwd;
	}
	
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
}
