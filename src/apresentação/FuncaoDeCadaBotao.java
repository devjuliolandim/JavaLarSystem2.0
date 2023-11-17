package apresentação;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import negocio.LerDadosDoArquivo;

public class FuncaoDeCadaBotao {

	
	public void selecionarArquivoDeInstantes() {
		
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.setFileFilter(new FileNameExtensionFilter("csv", "csv"));
		
		int resultado = fileChooser.showOpenDialog(null);
		
		
		if(resultado == JFileChooser.APPROVE_OPTION) {
			
			File arquivoSelecionado = fileChooser.getSelectedFile();
			
			String diretorioDoArquivo = arquivoSelecionado.getAbsolutePath();
			
			
			new LerDadosDoArquivo().lerDadosDoArquivo(diretorioDoArquivo);
			
			System.out.println("Arquivo selecionado: " + arquivoSelecionado);
		}
		
		
	}
	
	
	
	
}
