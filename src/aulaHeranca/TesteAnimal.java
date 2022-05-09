package aulaHeranca;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Husky", "Branco", "Dom�stico");
		dog.setNumPatas(4);
		Gato kitty = new Gato("Felino", "Preto", "Dom�stico");

		// Imprime o endere�o de mem�ria
		System.out.println(dog);
		System.out.println(kitty);
		

		
		System.out.println("Esp�cie: " + dog.getEspecie());
		System.out.println("Cor: " + dog.getCor());
		System.out.println("Habitat: " + dog.getHabitat());
		System.out.println("N�mero de patas: " + dog.getNumPatas());
		dog.fazerBarulho();
		
		System.out.println();
		
		System.out.println("Esp�cie: " + kitty.getEspecie());
		System.out.println("Cor: " + kitty.getCor());
		System.out.println("Habitat: " + kitty.getHabitat());
		kitty.fazerBarulho();
		
		
	}

}
