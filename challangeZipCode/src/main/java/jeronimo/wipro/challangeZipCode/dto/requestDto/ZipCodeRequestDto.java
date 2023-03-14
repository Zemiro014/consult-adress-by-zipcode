package jeronimo.wipro.challangeZipCode.dto.requestDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class ZipCodeRequestDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cep;
}
