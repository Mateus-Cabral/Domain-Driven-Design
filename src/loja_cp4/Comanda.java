package loja_cp4;

/**
 * @author MateusCabral
 * 
 */

import java.util.ArrayList;

public class Comanda {
	private ArrayList<ItemComanda> itens = new ArrayList<ItemComanda>();
	
	/*
	 * Empty constructor
	 */
	public Comanda() {

	}
	
	/**
	 * the method registrarItem adds a new item to the list
	 * @param item to be given by the user
	 */
	public void registrarItem(ItemComanda item) {
		itens.add(item);
	}
	
	/*
	 * the calcularPrecoTotal method returns the price for the whole list
	 * 
	 */
		public float calcularPrecoTotal() {
			float valorTotal = 0;
			for(ItemComanda item : itens) {
				valorTotal += item.calcularPreco();
			}
			return valorTotal;
		}
	
	@Override
	
	public String toString() {
		String relatorio = "";
		for(ItemComanda item : itens) {
			relatorio += item.toString() + "\n";
		}
		return relatorio;
	}
	
	public String formatarParaImprimir() {
		StringBuilder sb = new StringBuilder();
		for (ItemComanda itemComanda : itens) {
			sb.append(itemComanda.toString() + '\n');
		}
		
		return sb.toString();
	}

	/**
	 * @return the itens
	 */
	public ArrayList<ItemComanda> getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 */
	public void setItens(ArrayList<ItemComanda> itens) {
		this.itens = itens;
	}


	
	
	
}
