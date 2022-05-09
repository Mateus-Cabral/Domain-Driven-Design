package aulaHeranca;

public class Cachorro extends Animal {

	private int numPatas;
	
	
	public Cachorro(String especie, String cor, String habitat) {
		super(especie, cor, habitat);
	}
	
//	public Cachorro(String especie, String cor, String habitat, int numPatas) {
//		super.setCor(cor);
//		super.setEspecie(especie);
//		super.setHabitat(habitat);
//		this.numPatas = numPatas;
//	}
	
	public void fazerBarulho() {
		System.out.println("Au Au");
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	
	
	
	
}
