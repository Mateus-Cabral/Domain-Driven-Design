package construtores;

import java.util.Scanner;

public class Caixa {
	//atributos
	private double largura; 
	private double altura; 
	private double profundidade;
	
	
	//construtor
	public Caixa() {
		this.largura = 10.0;
		this.altura = 10.0;
		this.profundidade = 10.0;
		
	}
	
	
	//construtor parametrizado
	public Caixa(double a, double l, double p){
		this.altura = a;
		this.largura = l;
		this.profundidade = p;
	}
	
	
	//entrada de dados
	public void entradaDados() {
		Scanner input = new Scanner(System.in);

		//entrada de dados do usuário e configurando	
		System.out.println("Digite o valor da Altura: ");
		double altura = input.nextDouble();
		setAltura(altura);
		
		System.out.println("Digite o valor da Largura: ");
		double largura = input.nextDouble();
		setLargura(largura);
		
		System.out.println("Digite o valor da Profundidade: ");
		double profundidade = input.nextDouble();
		setProfundidade(profundidade);
		
	}
	
	
	public double entradaDados2() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Número: ");
		double n = input.nextDouble();
		return n;
	}
	
	
	
	//métodos
	public double volumeCaixa() {
		System.out.println("Calculando volume da caixa...");
		return (largura * altura * profundidade);
	}

	
	//eclipse, eu te amo. Sempre amei
	//getters e setters feito automaticamente

	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getProfundidade() {
		return profundidade;
	}


	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	

	
}
