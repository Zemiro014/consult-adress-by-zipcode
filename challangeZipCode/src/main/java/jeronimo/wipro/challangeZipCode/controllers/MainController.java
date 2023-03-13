package jeronimo.wipro.challangeZipCode.controllers;


import jeronimo.wipro.challangeZipCode.dto.requestDto.ZipCodeRequestDto;
import jeronimo.wipro.challangeZipCode.dto.responsesDto.AdressResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1")
public class MainController {

    @GetMapping(value = "consulta-endereco")
    public ResponseEntity<AdressResponseDto> findAddresByZipCode(@RequestBody ZipCodeRequestDto request) {
        AdressResponseDto adressResponseDto = new AdressResponseDto();
        return ResponseEntity.ok(adressResponseDto);
    }
}
