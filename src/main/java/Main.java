import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {





        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/60be745fe9b1f20f341e7595/latest/BRL"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson teste = new Gson();
        Main api = teste.fromJson(response.body(), Main.class);

        System.out.println("Answer JSON:");
        System.out.println(response.body());

        System.out.println("Answer Object:");
        System.out.println(api);

    }
}
