package construtores;

public class TesteCaixa {

	public static void main(String[] args) {
		Caixa c1 = new Caixa();
		System.out.println("Altura da caixa 1: " + c1.getAltura());
		System.out.println("Largura da caixa 1: " + c1.getLargura());
		System.out.println("Profundidade da caixa 1: " + c1.getProfundidade());
		System.out.println("Volume da caixa 1: " + c1.volumeCaixa());
		System.out.println();
		
		
		Caixa c2 = new Caixa(5.0, 5.0, 5.0);
		System.out.println("Altura da caixa 2: " + c2.getAltura());
		System.out.println("Largura da caixa 2: " + c2.getLargura());
		System.out.println("Profundidade da caixa 2: " + c2.getProfundidade());
		System.out.println("Volume da caixa 2: " + c2.volumeCaixa());
		System.out.println();
		
		
		Caixa c3 = new Caixa();
		c3.entradaDados();
		System.out.println("Altura da caixa 3: " + c3.getAltura());
		System.out.println("Largura da caixa 3: " + c3.getLargura());
		System.out.println("Profundidade da caixa 3: " + c3.getProfundidade());
		System.out.println("Volume da caixa 3: " + c3.volumeCaixa());
		System.out.println();
		
		
		double largura, altura, profundidade;
		
		System.out.println("Altura");
		altura = c1.entradaDados2();
		
		System.out.println("Largura");
		largura = c1.entradaDados2();
		
		System.out.println("Profundidade");
		profundidade = c1.entradaDados2();
		
		Caixa c4 = new Caixa(altura, largura, profundidade);
		
		System.out.println("Altura da caixa 4: " + c4.getAltura());
		System.out.println("Largura da caixa 4: " + c4.getLargura());
		System.out.println("Profundidade da caixa 4: " + c4.getProfundidade());
		System.out.println("Volume da caixa 4: " + c4.volumeCaixa());
		System.out.println();
		
	}

}
