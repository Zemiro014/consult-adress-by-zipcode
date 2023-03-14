package jeronimo.wipro.challangeZipCode.controllers;


import jeronimo.wipro.challangeZipCode.dto.requestDto.ZipCodeRequestDto;
import jeronimo.wipro.challangeZipCode.dto.responsesDto.AdressResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1")
public class MainController {

    @PostMapping(value = "/consulta-endereco")
    public ResponseEntity<AdressResponseDto> findAddresByZipCode(@RequestBody ZipCodeRequestDto request) {
        System.out.println(request.getCep());
        AdressResponseDto adressResponseDto = new AdressResponseDto();
        return ResponseEntity.ok(adressResponseDto);
    }
}
