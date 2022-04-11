package kboom;

public class Teste {

	public static void main(String[] args) {
		Contador banana = new Contador();
		System.out.println(banana.retornarCont());
		banana.incCont();
		System.out.println(banana.retornarCont());
		banana.incCont();
		System.out.println(banana.retornarCont());
		banana.zerarCont();
		System.out.println(banana.retornarCont());
	}
}
