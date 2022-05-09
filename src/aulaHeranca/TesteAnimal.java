package aulaHeranca;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Husky", "Branco", "Doméstico");
		dog.setNumPatas(4);
		Gato kitty = new Gato("Felino", "Preto", "Doméstico");

		// Imprime o endereço de memória
		System.out.println(dog);
		System.out.println(kitty);
		

		
		System.out.println("Espécie: " + dog.getEspecie());
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Habitat: " + dog.getHabitat());
		System.out.println("Número de patas: " + dog.getNumPatas());
		dog.fazerBarulho();
		
		System.out.println();
		
		System.out.println("Espécie: " + kitty.getEspecie());
		System.out.println("Cor: " + kitty.getCor());
		System.out.println("Habitat: " + kitty.getHabitat());
		kitty.fazerBarulho();
		
		
	}

}
