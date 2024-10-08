package API.authController;

import API.dto.AuthRequestDto;
import API.dto.AuthResponseDto;
import com.google.gson.Gson;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.fluent.Response;
import org.apache.http.entity.ContentType;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginHttpClientTest {
    @Test
    public void loginSuccessfulWithDto() throws IOException {
        AuthRequestDto requestDto = AuthRequestDto.builder()
                .username("admin")
                .password("Qwerty123!")
                .build();
        Gson gson = new Gson();
        Response response = Request.Post("https://platform-qxs32.ondigitalocean.app/api/login")
                .bodyString(gson.toJson(requestDto), ContentType.APPLICATION_JSON)
                .execute();
        String responseJson = response.returnContent().asString();
        AuthResponseDto authResponseDto = gson.fromJson(responseJson, AuthResponseDto.class);
        System.out.println(authResponseDto);
    }
}
