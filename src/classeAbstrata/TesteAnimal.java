package classeAbstrata;

public class TesteAnimal {

	public static void main(String[] args) {
		Coelho trovao = new Coelho();
		Pato quackBoy = new Pato();
		
		trovao.fazerBarulho();
		trovao.setNome("Trovão");
		System.out.println(trovao.getNome());
		quackBoy.fazerBarulho();
		quackBoy.setNome("Quack Boy, The 3rd");
		System.out.println(quackBoy.getNome());
		quackBoy.trocaNome();
	}

}
