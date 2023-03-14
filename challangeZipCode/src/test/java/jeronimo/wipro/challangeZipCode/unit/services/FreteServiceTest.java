package jeronimo.wipro.challangeZipCode.unit.services;

import jeronimo.wipro.challangeZipCode.services.FreteService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FreteServiceTest {

    FreteService service = new FreteService();
    @Test
    void calcularFreteTest(){
        double frete = service.calcularFrete("rs");
        assertEquals(17.30, frete);

        frete = service.calcularFrete("rj");
        assertEquals(7.85, frete);

        frete = service.calcularFrete("df");
        assertEquals(12.50, frete);

        frete = service.calcularFrete("ba");
        assertEquals(15.98, frete);

        frete = service.calcularFrete("am");
        assertEquals(20.83, frete);
    }
}
