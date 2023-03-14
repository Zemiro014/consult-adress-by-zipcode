package jeronimo.wipro.challangeZipCode.dto.responsesDto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cep;
    private String rua;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private double frete;

}
