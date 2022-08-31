package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> lista1 = new ArrayList<String>();
		
		lista1.add("Honda");
		lista1.add("BMW");
		lista1.add("Volvo");
		lista1.add("Mercedes");
		lista1.add("Ford");
		lista1.add("Nissan");
		
//		System.out.println(lista1);
		
		for(String carro : lista1) {
			System.out.println(carro);
		}
		
		//Acessando UM elemento do ArrayList
		System.out.println("Carro: " + lista1.get(3));
		System.out.println("---------");
		
		//Alterando um elemento do ArrayList - set()
		lista1.set(4, "Toyota");
		System.out.println(lista1);
		System.out.println("--------- \nAlteração!\n---------");
		lista1.set(5, "Jeep");
		System.out.println(lista1);
		
		//Removendo um elemento do ArrayList - remove()
		lista1.remove(0);
		System.out.println(lista1);
		
		
		//Criando um ArrayList de outros tipos (Integer)
		//wrapper class 
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(5);
		numeros.add(-3);
		numeros.add(10);
		numeros.add(30);
		numeros.add(200);
		
		System.out.println(numeros);
		
		//Foreach
		for (Integer elemento : numeros) {
			System.out.println(elemento);
		}

		System.out.println("---------");
		
		for(int i : numeros) {
			System.out.println(i);
		}
		//Lista ordenada
		System.out.println("Ordenando a lista...");
		Collections.sort(numeros);
		System.out.println(numeros);
		Collections.sort(lista1);
		System.out.println(lista1);

		
		
		//Criando uma lista heterogênea (sem Generics)
		ArrayList listaHet = new ArrayList();
		listaHet.add(10);     //Integer
		listaHet.add(true);   //Boolean
		listaHet.add("FIAP"); //String
		System.out.println(listaHet);
		
		Collections.sort(listaHet);
		System.out.println(listaHet);

		//Verificar se a lista está vazia
		if (listaHet.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(listaHet);
		}
	}

}
