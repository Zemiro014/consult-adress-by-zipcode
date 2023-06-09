package jeronimo.wipro.challangeZipCode.services;

import jeronimo.wipro.challangeZipCode.externalApis.ViaCepApi;
import jeronimo.wipro.challangeZipCode.dto.responsesDto.AddressResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vertx.java.core.json.JsonObject;

@Service
public class AddressService {

    @Autowired
    private FreteService freteService;

    @Autowired
    private ViaCepApi viaCepApi;

    public AddressResponseDto getEnderecoComFrete(String cep) {
        String response = viaCepApi.getAddressViaCep(cep);

        JsonObject jsonObject = new JsonObject(response);

        AddressResponseDto addressResponseDto = new AddressResponseDto();
        addressResponseDto.setCidade(jsonObject.getString("localidade"));
        addressResponseDto.setCep(jsonObject.getString("cep"));
        addressResponseDto.setRua(jsonObject.getString("logradouro"));
        addressResponseDto.setComplemento(jsonObject.getString("complemento"));
        addressResponseDto.setBairro(jsonObject.getString("bairro"));
        addressResponseDto.setEstado(jsonObject.getString("uf"));

        double frete = freteService.calcularFrete(jsonObject.getString("uf"));
        addressResponseDto.setFrete(frete);

        return addressResponseDto;
    }
}
