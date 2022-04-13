package aula04;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("Hairo Newdawn");
		f1.setDepto("Instrução de novatos");
		f1.setAdmissao("13/07/2022");
		f1.setRg("04");
		f1.setSal(5000);
		
		//System.out.println(f1.getFicha());
		System.out.println(f1.getSal());
		double novo_sal = f1.aumentarSalario(20);
		System.out.println("Aumento de 20%: " + f1.getSal());
		double novo_sal1 = f1.aumentarSalario(30);
		System.out.println("Aumento de 30%: " + f1.getSal());

	}

}
