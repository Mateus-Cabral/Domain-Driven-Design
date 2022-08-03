package classeAbstrata;

public abstract class Animal {
	private String nome;
	
	public void trocaNome() {
		this.setNome("Maracutaia");
		System.out.println(this.getNome());
	}
	
	public abstract void fazerBarulho();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}