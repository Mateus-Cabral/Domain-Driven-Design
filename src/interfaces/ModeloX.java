package interfaces;

public class ModeloX extends TV implements ControleRemoto{
	
	public static final String MODELO = "TV-X";
	
	public ModeloX() {
		super();
	}

	public ModeloX(int tamanhoTela) {
		super(tamanhoTela);
	}

	@Override
	public void mudarCanal(int canal) {
		this.setCanal(canal);
	}

	@Override
	public void aumentarVolume() {
		this.setVolume((int) (this.getVolume() + (this.getVolume() * 0.2/100)));
		
	}

	@Override
	public void alterarVolume(int volume) {
		this.setVolume(volume);
	}

	@Override
	public void ligar() {
		this.setStatus(true);
	}

	@Override
	public void desligar() {
		System.out.println("Desligando, tenha um bom dia!");
		this.setStatus(false);
	}
	
	
}
