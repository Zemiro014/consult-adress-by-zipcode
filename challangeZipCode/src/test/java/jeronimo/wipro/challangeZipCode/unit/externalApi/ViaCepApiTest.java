package jeronimo.wipro.challangeZipCode.unit.externalApi;

import jeronimo.wipro.challangeZipCode.externalApis.ViaCepApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.client.MockRestServiceServer;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@RestClientTest(ViaCepApi.class)
public class ViaCepApiTest {

    @Autowired
    private MockRestServiceServer server;

    @Autowired
    private ViaCepApi viaCepApi;

    @Value("${via.cep.base.url}")
    private String viaCepBaseUrl;

    @Test
    public void getAddressViaCep(){
        this.server.expect(requestTo(viaCepBaseUrl+"93010004/json"))
                .andRespond(withSuccess("OK", MediaType.TEXT_PLAIN));

        String result = viaCepApi.getAddressViaCep("93010004");

        assertThat(result).isEqualTo("OK");
    }
}
