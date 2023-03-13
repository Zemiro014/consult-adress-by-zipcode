package jeronimo.wipro.challangeZipCode.dto.responsesDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
@Setter
@Getter
public class AdressResponseDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cep;
    private String rua;
    private String complemento;

    private String bairro;

    private String cidade;

    private String estado;

    private float frete;


}
