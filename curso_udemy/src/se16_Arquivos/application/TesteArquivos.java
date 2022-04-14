package se16_Arquivos.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import se16_Arquivos.entities.Produto;

public class TesteArquivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		
		System.out.println("Digite o caminho do arquivo: ");
		String fonteArquivoStr = sc.nextLine();
		
		File fonteArquivo = new File(fonteArquivoStr);
		String fontePastaStr = fonteArquivo.getParent();
		
		boolean sucesso = new File(fontePastaStr + "\\out").mkdir();

		String alvoArquivoStr = fontePastaStr + "\\out\\summary.csv";
				
		try (BufferedReader br = new BufferedReader(new FileReader(alvoArquivoStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);
				
				lista.add(new Produto(nome, preco, quantidade));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(alvoArquivoStr))){
				for(Produto item: lista) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(alvoArquivoStr + "CRIADO!");
				
			} catch (IOException e) {
				
				System.out.println("Erro ao escrever arquivo: "+ e.getMessage());
			}
		} catch (IOException e) {
			
			System.out.println("Erro ao ler arquivo: "+e.getMessage());
		}
		
		sc.close();
	}

}
