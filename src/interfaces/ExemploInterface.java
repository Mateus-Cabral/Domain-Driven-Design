package interfaces;

public class ExemploInterface {

	public static void main(String[] args) {
		ModeloTV001 tv1 = new ModeloTV001(50);
		ModeloX tv2 = new ModeloX(100);
		
		tv1.ligar();
		tv2.desligar();
		System.out.println("TV Desligada: " + ModeloX.MODELO);
		System.out.println("Status: " + (tv1.isStatus() ? "Ligado" : "Desligado"));
		System.out.println("Status: " + (tv2.isStatus() ? "Ligado" : "Desligado"));
		
		tv1.desligar();
		System.out.println("TV Desligada: " + ModeloTV001.MODELO);
		
	}

}
