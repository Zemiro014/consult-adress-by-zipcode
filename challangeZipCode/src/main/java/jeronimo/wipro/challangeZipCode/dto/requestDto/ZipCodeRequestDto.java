package jeronimo.wipro.challangeZipCode.dto.requestDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

//@Data
//@Setter
//@Getter
public class ZipCodeRequestDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String cep;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
