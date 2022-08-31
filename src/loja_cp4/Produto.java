package loja_cp4;

/**
 * @author MateusCabral
 * 
 */

public class Produto {	
	
	/**
	 * private attribute codigo
	 */
	private int codigo;
	
	/**
	 * private attribute desc
	 */
	private String desc;
	
	/**
	 * private attribute preco
	 */
	private float preco;
	
	/*
	 * Constructor using Fields
	 */
	public Produto(int codigo, String desc, float preco) {
		this.setCodigo(codigo);
		this.setDesc(desc);
		this.setPreco(preco);
	}	
	
	@Override
	
	/**
	 * @return Retorna as informações de um produto
	 */
	
	public String toString() {
		return "Código do produto: " + this.getCodigo() + " | Preço Unitário: " + this.getPreco() + ""
				+ "\nDescrição: " + this.getDesc();
	}
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the precoUnitario
	 */
	public float getPreco() {
		return preco;
	}
	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPreco(float precoUnitario) {
		this.preco = precoUnitario;
	}
}
