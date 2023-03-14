package cucumber;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import jeronimo.wipro.challangeZipCode.services.FreteService;
import org.junit.Assert;

public class DefinicaoPassos {

    private FreteService service;
    private double freteCalculado;

    private double freteRegiaoSul = 17.30;


    @Dado("Que os fretes estao definidas por regioes")
    public void queOsFretesEstaoDefinidasPorRegioes() {
        service = new FreteService();
    }

    @Quando("pesquisar o frete de um estado com o seu uf {string}")
    public void pesquisarOFreteDeUmEstadoComOSeuUf(String arg0) {
        freteCalculado = service.calcularFrete(arg0);
    }

    @Entao("O frete desse estado deve ser calculado")
    public void oFreteDesseEstadoDeveSerCalculado() {
        Assert.assertNotNull(freteCalculado);
    }

    @Quando("A uf do Estado for {string}")
    public void aUfDoEstadoFor(String arg0) {
        freteCalculado = service.calcularFrete(arg0);
    }

    @Entao("O valor do frete deve ser igual ao valor do frete da regiao sul")
    public void oValorDoFreteDeveSerIgualAoValorDoFreteDaRegiaoSul() {
        Assert.assertEquals(freteCalculado, freteRegiaoSul, 0.0);
    }
}
