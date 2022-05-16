package classeAbstrata;

public class Horista extends Empregado{
	
	private double horasTrabalhadas;
	private double precoHora;
	
	@Override
	public double vencimento() {
		return this.getHorasTrabalhadas() * this.getPrecoHora(); 
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}

}
