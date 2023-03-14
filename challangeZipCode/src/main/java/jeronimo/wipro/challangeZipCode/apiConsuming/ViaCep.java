package jeronimo.wipro.challangeZipCode.apiConsuming;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@Service
public class ViaCep {

    @Value("${via.cep.base.url}")
    private String viaCepBaseUrl;

    public StringBuilder getAddressViaCepJson(String cep) {
        try {
            URL url = new URL(viaCepBaseUrl+cep+"/json");
            URLConnection connection = url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            String response = "";
            StringBuilder responseBuilder = new StringBuilder();

            while ((response = bufferedReader.readLine()) != null ) {
                responseBuilder.append(response);
            }
            System.out.println(responseBuilder);

            return responseBuilder;

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
