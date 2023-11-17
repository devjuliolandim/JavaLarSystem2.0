package negocio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerDadosDoArquivo {

	public  List<String[]> lerDadosDoArquivo(String caminhoArquivo) {

		List<String[]> informacoes = new ArrayList<String[]>();

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))) {

			String informacao;
			
			//Ler a primeira linhas, evitando os nomes
			bufferedReader.readLine();

			while ((informacao = bufferedReader.readLine()) != null) {

				String[] campo = informacao.split(",");

				informacoes.add(campo);
			}

		} catch (IOException e) {

			e.printStackTrace();

		}
		
		//TESTE : VER SE ESTÁ LENDO O ARQUIVO DIREITO
		
		for(String[] info: informacoes) {
			
			for(String campo: info) {
				
				System.out.print(campo + " ");
			}
			
			System.out.println();
		}

		return informacoes;
	}

}
