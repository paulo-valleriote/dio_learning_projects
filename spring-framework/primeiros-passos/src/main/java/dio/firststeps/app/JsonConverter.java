package dio.firststeps.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;

@Component
public class JsonConverter {
  @Autowired
  private Gson gson;

  public ViaCepResponse convert(String json) {
    ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
    return response;
  }
}
