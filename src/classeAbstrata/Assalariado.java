package classeAbstrata;

public class Assalariado extends Empregado{
	
	private double salario;

	@Override
	public double vencimento() {
		return this.getSalario();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	
}
