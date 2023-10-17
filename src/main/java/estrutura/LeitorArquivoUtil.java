package estrutura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivoUtil {

	private LeitorArquivoUtil() {}
	
	public static String lerArquivo() {
		String conteudoTexto = "";

        try (BufferedReader leitor = new BufferedReader(new FileReader("src/main/java/arvores.json"))) {
            StringBuilder conteudoArquivo = new StringBuilder();
            String linha;

            while ((linha = leitor.readLine()) != null) {
                conteudoArquivo.append(linha);
            }

            conteudoTexto = conteudoArquivo.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conteudoTexto;
	}
	
}
