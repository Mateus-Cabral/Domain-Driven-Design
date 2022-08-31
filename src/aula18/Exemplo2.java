/**
 * 
 */
package aula18;

/*
 * @author Mateus Cabral
 * @deprecated - significa que está obsoleto
 * @link - 
 * @param - relacionado aos parametros de uma classe
 * @return - relacionado ao retorno de uma classe
 * @see - marca como uma classe/anotação importante para leitura
 * @since - coloca a data em que o documento/classe foi criada
 * @throws - tipo de excessão que o método lança
 * @version - número da versão do projeto
 */

/**
 * 
 * @author Mateus Cabral
 * @version 1.0
 * @since Release 01 of the application - 24/08/2022
 * 
 * Esta classe é um exemplo da aula sobre JavaDoc - doclets
 * 
 */
public class Exemplo2 {
	/**
	 * att matricula - represents the registration of a employee
	 */
	private String matricula;
	/**
	 * att salario - represents the salary of a employee
	 */
	private double salario;
	
	/**
	 * @param matricula to matricula
	 * @param salario to salario
	 */
	public Exemplo2(String matricula, double salario) {
		this.matricula = matricula;
		this.salario = salario;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	/**
	 * Method to calculate the day value of a employee based on his salary,
	 * considering a commercial month of 30 days. It uses trips costs as well
	 * 
	 * @author Mateus Cabral
	 * @since 24/08/2022
	 * @version 1.0
	 * 
	 * @param diasViagem - dias da viagem do funcionário
	 * @param valorDescolamento - valor do descolamento
	 * @return ajudaCusto
	 */
	public double calculaAjudaCusto(int diasViagem, double valorDescolamento) {
		double ajudaCusto = this.salario / 30;
		return ajudaCusto;
	}
	
	/**
	 * Método para calcular o valor de uma bonificação (Regra de negócio)
	 * Critérios:
	 * * total de vendas menor do que R$ 25K = 5%
	 * * total de vendas maior do que R$ 50K = 10%
	 * 
	 * @author Mateus Cabral
	 */
	
	 /**
	  * @params valorVendas valor total das vendas do mês
	  * @return salario (double) retorna a bonificação do funcionário
	  */
	public double calculaBonificacao(double valorVendas) {
		if(valorVendas < 25000) {
			return (getSalario() * 0.05);
		}else {
			return (getSalario() *0.1);
		}
	}
	
}
