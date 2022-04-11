package kboom;

public class Contador {
	int cont;
	
	public void zerarCont(){
		cont = 0;
	}
	
	public void incCont() {
		cont = cont + 1;
	}
	
	public int retornarCont() {
		return cont;
	}
	
	public static void main(String[] args) {
		Contador cont1 = new Contador();
		cont1.zerarCont();
		System.out.println("Valor: " + cont1.retornarCont());
		cont1.incCont();
		System.out.println("Valor: " + cont1.retornarCont());
		cont1.incCont();
		System.out.println("Valor: " + cont1.retornarCont());
		cont1.zerarCont();
		System.out.println("Valor: " + cont1.retornarCont());
	}
}

