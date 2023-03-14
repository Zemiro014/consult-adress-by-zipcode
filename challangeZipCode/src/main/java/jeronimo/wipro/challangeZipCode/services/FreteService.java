package jeronimo.wipro.challangeZipCode.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FreteService {

    private List<String> cidadesDaRegiaoSudest = Arrays.asList("ES", "MG", "RJ", "SP");
    private List<String> cidadesDaRegiaoCentroOest = Arrays.asList("DF", "GO", "MT", "MS");
    private List<String> cidadesDaRegiaoNordeste = Arrays.asList("AL", "BA", "CE", "MA", "PB", "PI", "PE", "RN", "SE");
    private List<String> cidadesDaRegiaoSul = Arrays.asList("PR", "RS", "SC");
    private List<String> cidadesDaRegiaoNorte = Arrays.asList("AC", "AP", "AM", "PA", "RO", "RR", "TO");


    public double calcularFrete(String uf) {
        if (cidadesDaRegiaoSudest.contains(uf.toUpperCase())) return 7.85;
        else if (cidadesDaRegiaoCentroOest.contains(uf.toUpperCase())) return 12.50;
        else if (cidadesDaRegiaoNordeste.contains(uf.toUpperCase())) return 15.98;
        else if (cidadesDaRegiaoSul.contains(uf.toUpperCase())) return 17.30;
        else if (cidadesDaRegiaoNorte.contains(uf.toUpperCase())) return 20.83;
        else return 0.0;
    }
}
