package se10_ArrayEListas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TesteLista {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("João");
		lista.add(2, "Brian");
		lista.add("Ana");
		
		System.out.println("Tamanho da lista: "+lista.size());
		System.out.println("Elementos da lista:");
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("Remover elemento iniciando com a letra M");
		
		lista.removeIf(elemento -> elemento.charAt(0) == 'M');
		for(String elemento : lista) {
			System.out.println(elemento);
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("Tamanho da lista: "+lista.size());
		System.out.println("Indice de Ana: "+lista.indexOf("Ana"));
		
		System.out.println("Mostrar elemento iniciando com a letra B");
		List<String> resultado = lista.stream().filter(elemento -> elemento.charAt(0) == 'B').collect(Collectors.toList());
		for(String elemento : resultado) {
			System.out.println(elemento);
		}
		
		System.out.println("---------------------------------");
		
		System.out.println("Mostrar elemento iniciando com a letra G (inexistente)");
		String nome = lista.stream().filter(elemento -> elemento.charAt(0) == 'G').findFirst().orElse("inexistente");
		System.out.println(nome);
	}
}
