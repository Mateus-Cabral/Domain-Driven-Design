package kboom;

public class Pokemon {
	
	String nome;
	String tipo;
	int poknumber;
	
	public void setNome(String pokemon) {
		nome = pokemon;
	}
	
	public void setTipo(String tipagem) {
		tipo = tipagem;
	}
	
	public void setPoknumber(int num) {
		poknumber = num;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public int getPoknumber() {
		return poknumber;
	}
	
	public String getFicha() {
		String msg;
		msg = ("Nome: " + nome + System.lineSeparator() +
				"Tipo: " + tipo + System.lineSeparator() +
				"Número: " + poknumber);
		return msg; 
	}
	
	public static void main(String[] args) {
		Pokemon snivy = new Pokemon();
		snivy.setNome("Snivy");
		snivy.setTipo("Grama");
		snivy.setPoknumber(495);
		
		Pokemon tepig = new Pokemon();
		tepig.setNome("Tepig");
		tepig.setTipo("Fogo");
		tepig.setPoknumber(498);
		
		Pokemon oshawott = new Pokemon();
		oshawott.setNome("Oshawott");
		oshawott.setTipo("Água");
		oshawott.setPoknumber(501);
		
		System.out.println(snivy.getFicha());
		System.out.println();
		System.out.println(tepig.getFicha());
		System.out.println();
		System.out.println(oshawott.getFicha());
	}
}
