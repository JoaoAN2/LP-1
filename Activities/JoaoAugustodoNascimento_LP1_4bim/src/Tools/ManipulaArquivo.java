package Tools;

// @author Radames
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


/*
IMPORTANTE
Caso não seja informado um caminho completo
o arquivo será salvo na pasta atual
No caso, dentro do próprio projeto.
*/

public class ManipulaArquivo {

    public ManipulaArquivo() {
    }

    public boolean existeOArquivo(String caminhoENomeArquivo) {
        BufferedReader arquivoReader;
        File arq = new File(caminhoENomeArquivo);
        if (arq.exists()) {
            try {
                arquivoReader = new BufferedReader(new FileReader(caminhoENomeArquivo));
            } catch (Exception e) {
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean criarArquivoVazio(String caminhoENomeArquivo) {
        try {
            BufferedReader arquivoReader;
            FileWriter f = new FileWriter(caminhoENomeArquivo);
            f.close();
            try {
                arquivoReader = new BufferedReader(new FileReader(caminhoENomeArquivo));
            } catch (Exception e) {
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<String> abrirArquivo(String caminho) {
        List<String> texto = new ArrayList<String>();
        try {
            //OpenFile
            FileReader arquivo = new FileReader(caminho);
            BufferedReader conteudoDoArquivo = new BufferedReader(arquivo);
            String linha = conteudoDoArquivo.readLine();
            while (linha != null) {
                texto.add(linha);
                linha = conteudoDoArquivo.readLine();
            }
            conteudoDoArquivo.close();
        } catch (Exception e) {//Catch exception if any
            texto = null;
            System.err.println("Erro: " + e.getMessage());
        }
        return texto;
    }

    public int salvarArquivo(String caminho, List<String> texto) {
        try {
            // Create file 
            FileWriter arquivo = new FileWriter(caminho);
            BufferedWriter conteudoDoArquivo = new BufferedWriter(arquivo);
            for (int i = 0; i < texto.size(); i++) {
                conteudoDoArquivo.write(texto.get(i) + System.getProperty("line.separator")); // 
            }
            conteudoDoArquivo.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            return 1; //houve erro
        }
        return 0;
    }
}
