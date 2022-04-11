package kboom;

public class Lampada {
	
	boolean estado;
	
	public void ligarLampada() {
		estado = true;
	}
	
	public void desligarLampada() {
		estado = false;
	}
	
	public String getEstado(boolean estado) {
		String msg = null;
		
		if (estado == true) {
			msg = "Ligada";
		} else {
			msg = "Desligada";
		}
		
		return msg;
	}
	
	public static void main(String[] args) {
		Lampada lamp = new Lampada();
		System.out.println("Status: " + lamp.getEstado(lamp.estado));
		lamp.ligarLampada();
		System.out.println("Status: " + lamp.getEstado(lamp.estado));
		lamp.desligarLampada();
		System.out.println("Status: " + lamp.getEstado(lamp.estado));
	}
}
