
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Tradutor {

    private Map<String, String> dicionario;
    
    public Tradutor() {
       dicionario = new HashMap<>();
    }
    
    public void lerArquivoJson(String caminho) {
        try {
            File arquivo = new File(caminho);
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<HashMap<String, String>> tipo = new TypeReference<HashMap<String, String>>() {};
            dicionario = mapper.readValue(arquivo, tipo);
            
        } catch (IOException e) {
            System.err.println("Não foi possível ler o arquivo Json " + e.getMessage());
        }
    }
    
    public String traduzir (String palavra) {
        String traducao = dicionario.getOrDefault(palavra, "Tradução não encontrada");
        return traducao;
    }
        
}

