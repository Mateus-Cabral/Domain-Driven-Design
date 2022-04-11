package kboom;

public class Conta {
	//Criar uma classe Conta que contenha 
	//o nome do cliente, o n�mero da conta e o saldo.

	String nome;
	int Conta;
	double saldo;
	
	public void setNome(String novNome) {
		nome = novNome;
	}
	
	public void setConta(int novo) {
		Conta = novo;
	}
	
	public void setSaldo(double valor) {
		saldo = valor;
	}
	
	//Criar um m�todo depositar e um m�todo sacar
	//Criar m�todos para acessar os atributos para cada atributo da classe.
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getConta() {
		return Conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	//O programa principal deve instanciar objetos da classe Conta 
	//e utilizar seus m�todos.
	
	public static void main(String[] args) {
		Conta teste = new Conta();
		teste.setNome("Snivy melhor inicial");
		teste.setConta(5);
		teste.setSaldo(495);
		System.out.println("Nome: " + teste.getNome());
		System.out.println("Regi�o: " + teste.getConta());
		System.out.println("Pokedex N�" + teste.getSaldo());
	}
}
