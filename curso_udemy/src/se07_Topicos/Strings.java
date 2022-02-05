package se07_Topicos;


public class Strings {

	public static void main(String[] args) {
		
		
		String palavra = "aBcDEgfgH";
		System.out.println("Palavra original: " + palavra);
		
		System.out.println("Palvra original após as funções de String");
		
		String s01 = palavra.toLowerCase();
		System.out.println("Formatar: Caixa Baixa>> " + s01);
		
		String s02 = palavra.toUpperCase();
		System.out.println("Formatar: Caixa Alta>> " + s02);
		
		String s03 = palavra.replace("a", "X");
		System.out.println("Substituir: a por X>> " + s03);
		
		int s04 = palavra.indexOf("c");
		System.out.println("Buscar: Indice da letra c >> " + s04);
		
		int s05 = palavra.lastIndexOf("g");
		System.out.println("Buscar: Ultimo indice da letra g>> " + s05);


	}

}
