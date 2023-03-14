package jeronimo.wipro.challangeZipCode.controllers;


import jeronimo.wipro.challangeZipCode.dto.requestDto.ZipCodeRequestDto;
import jeronimo.wipro.challangeZipCode.dto.responsesDto.AddressResponseDto;
import jeronimo.wipro.challangeZipCode.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class MainController {

    @Autowired
    private AddressService addressService;

    @PostMapping(value = "/consulta-endereco")
    public ResponseEntity<AddressResponseDto> findAddresByZipCode(@RequestBody ZipCodeRequestDto request) {

        AddressResponseDto responseDto = addressService.getEnderecoComFrete(request.getCep());

        return ResponseEntity.ok(responseDto);
    }
}
