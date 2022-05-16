package classeAbstrata;

public class Comissionado extends Empregado{
	
	private double taxaComissao;
	private double totalVendas;
	
	public double getComissao() {
		return taxaComissao;
	}

	public void setComissao(double comissao) {
		this.taxaComissao = comissao;
	}

	public double getVendas() {
		return totalVendas;
	}

	public void setVendas(double vendas) {
		this.totalVendas = vendas;
	}

	@Override
	public double vencimento() {
		return this.getVendas() * this.getComissao();
	}
	

}
