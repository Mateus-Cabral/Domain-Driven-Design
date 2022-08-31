package loja_cp4;

/**
 * @author MateusCabral
 * 
 */

import java.util.ArrayList;

public class CatalogoProdutos {
	
	/**
	 * private attribute produtos, an ArrayList
	 */
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	
	/*
	 * Empty constructor
	 */
	public CatalogoProdutos() {
		
	}
	
	/**
	 * the method cadastrarProduto adds a new item to the list
	 * @param produto to be given by the user
	 */
	public void cadastrarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	/**
	 * the method buscaProduto searchs for a product inside the Array using a id and returns the object
	 * @param integer id to be given by the user
	 */
	public Produto buscaProduto(int codigo) {
		Produto p = null;
		for(Produto prod : produtos) {
			if(prod.getCodigo() == codigo) {
				p = prod;
				break;
			}
		}
		
		return p;
	}
	
	@Override
	
	public String toString() {
		String relatorio = "";
		for(Produto p: produtos) {
			relatorio += p.toString() + "\n";
		}
		return relatorio;
	}

	/**
	 * @return the produtos
	 */
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}
