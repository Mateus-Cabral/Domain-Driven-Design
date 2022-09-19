package interfaces;

public class TV {
	private int tamanhoTela;
	private int canal;
	private int volume;
	private boolean status;
	

	public TV() {
		
	}
	
	public TV(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
		this.canal = 0;
		this.volume = 0;
		this.status = false;
	}


	public int getTamanhoTela() {
		return tamanhoTela;
	}


	public void setTamanhoTela(int tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}


	public int getCanal() {
		return canal;
	}


	public void setCanal(int canal) {
		this.canal = canal;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
