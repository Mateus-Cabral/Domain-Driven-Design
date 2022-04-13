package aula04;

public class Funcionario {
	
	//atributos
	private String nome;
	private String depto;
	private double salario;
	private String admissao;
	private String rg;
	
	//getters and setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDepto() {
		return this.depto;
	}
	
	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public String getAdmissao() {
		return this.admissao;
	}
	
	public void setAdmissao(String data) {
		this.admissao = data;
	}
			
			
	public String getRg() {
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double getSal() {
		return this.salario;
	}
	
	public void setSal(double sal) {
		this.salario = sal;
	}
	
	public String getFicha() {
		String msg;
		return msg = "Nome: " + this.nome + System.lineSeparator() +
				"Departamento: " + this.depto + System.lineSeparator() +
				"Data de Admissão: " + this.admissao + System.lineSeparator() +
				"Salário atual: " + this.salario + " cristais" + System.lineSeparator() +
				"RG: " + this.rg + System.lineSeparator();
	}
	
	//Métodos
	public double aumentarSalario(double porcentagem) {
		double novo_sal = salario + (salario * (porcentagem / 100));
		return novo_sal;
	}
	
	public double calculoGanhoReal(double novoSalario) {
		double ganhoReal = salario - novoSalario;
		return ganhoReal;
	}
	
}
