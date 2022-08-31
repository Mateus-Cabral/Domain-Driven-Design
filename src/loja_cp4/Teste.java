package loja_cp4;

public class Teste {
	public static void main(String[] args) {
		//Teste da classe Produto
		Produto p1 = new Produto(01, "Used to pay for a Bicycle.", 1600);
		Produto p2 = new Produto(02, "Heals confusion.", 200);
		Produto p3 = new Produto(03, "Forces the holder to switch out when their stats are lowered. Consumed after use.", 800);
		
		System.out.println(p1.toString());
		System.out.println("---------------");
		
		//Teste da classe CatalogoProdutos
		
		CatalogoProdutos catalogo = new CatalogoProdutos();
		catalogo.cadastrarProduto(p1);
		catalogo.cadastrarProduto(p2);
		catalogo.cadastrarProduto(p3);
		
		System.out.println("Buscando pelo código 01...");
		System.out.println(catalogo.buscaProduto(01));
		
		System.out.println("---------------");
		//Teste da classe ItemComanda
		
		ItemComanda ic1 = new ItemComanda(p1, 2);
		ItemComanda ic2 = new ItemComanda(p2, 5);
		ItemComanda ic3 = new ItemComanda(p3, 2);
		
		System.out.println(ic1.toString());
		System.out.println("---------------");
		System.out.println("Preço dos itens: " + ic1.calcularPreco());
		System.out.println("---------------");
		//Teste da classe Comanda
		
		Comanda c = new Comanda();
		c.registrarItem(ic1);
		c.registrarItem(ic2);
		c.registrarItem(ic3);
		
		System.out.println(c.formatarParaImprimir());
		System.out.println("---------------");
		System.out.println("Preço total: " + c.calcularPrecoTotal());		
	}
}
