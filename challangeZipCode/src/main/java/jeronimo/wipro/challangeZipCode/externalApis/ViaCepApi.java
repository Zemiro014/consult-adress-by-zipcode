package jeronimo.wipro.challangeZipCode.externalApis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepApi {

    RestTemplate restTemplate;

    @Autowired
    public ViaCepApi(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }
    @Value("${via.cep.base.url}")
    private String viaCepBaseUrl;


    public String getAddressViaCep(String cep) {
        String result = restTemplate.getForObject(viaCepBaseUrl+cep+"/json", String.class);
        return result;
    }
}
