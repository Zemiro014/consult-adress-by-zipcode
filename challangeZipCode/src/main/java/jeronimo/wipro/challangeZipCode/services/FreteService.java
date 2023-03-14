package jeronimo.wipro.challangeZipCode.services;

import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public double calcularFrete(String cep) {

        return 7.85;
    }
}
