package jeronimo.wipro.challangeZipCode.services;

import jeronimo.wipro.challangeZipCode.apiConsuming.ViaCep;
import jeronimo.wipro.challangeZipCode.dto.responsesDto.AddressResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vertx.java.core.json.JsonObject;

@Service
public class AddressService {

    @Autowired
    private FreteService freteService;

    @Autowired
    private ViaCep viaCep;

    public AddressResponseDto getEnderecoComFrete(String cep) {
        StringBuilder response = viaCep.getAddressViaCepJson(cep);

        JsonObject jsonObject = new JsonObject(response.toString());

        AddressResponseDto addressResponseDto = new AddressResponseDto();
        addressResponseDto.setCidade(jsonObject.getString("localidade"));
        addressResponseDto.setCep(jsonObject.getString("cep"));
        addressResponseDto.setRua(jsonObject.getString("logradouro"));
        addressResponseDto.setComplemento(jsonObject.getString("complemento"));
        addressResponseDto.setBairro(jsonObject.getString("bairro"));
        addressResponseDto.setEstado(jsonObject.getString("uf"));

        double frete = freteService.calcularFrete(cep);
        addressResponseDto.setFrete(frete);

        return addressResponseDto;
    }
}
