package loja_cp4;

/**
 * @author MateusCabral
 * 
 */

public class ItemComanda {
	
	/**
	 * private attribute produto
	 */
	private Produto produto;
	
	/**
	 * private attribute qtde
	 */
	private int qtde;
	
	/*
	 * Constructor using Fields
	 */
	public ItemComanda(Produto produto, int quantidade) {
		this.setProduto(produto);
		this.setQtde(quantidade);
	}
	
	/*
	 * the calcularPreco method returns the price for the whole list
	 */
	public float calcularPreco() {
		return this.getProduto().getPreco() * this.getQtde();
	}
	
	@Override
	
	public String toString() {
		return "Informação do produto: " + this.getProduto().toString() + "\nQuantidade: " + this.getQtde();
	}
	
	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}
	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	/**
	 * @return the qtde
	 */
	public int getQtde() {
		return qtde;
	}
	/**
	 * @param qtde the qtde to set
	 */
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
}
