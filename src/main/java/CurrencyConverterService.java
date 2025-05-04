import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CurrencyConverterService {
    public static Double currencyApi(String moedaOrigem, String moedaDestino) {
        Scanner sc = new Scanner(System.in);


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/60be745fe9b1f20f341e7595/pair/" + moedaOrigem + "/" + moedaDestino))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                Gson gson = new Gson();
                String json = response.body();
                Coin retorno = gson.fromJson(json, Coin.class);
                return null;
            } else {
                System.err.println("Erro ao obter taxa de câmbio. Código de status: " + response.statusCode());
                return null;
            }
        } catch (IOException e) {
            System.err.println("Erro de E/S ao conectar à API: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (InterruptedException e) {
            System.err.println("Thread interrompida durante a conexão à API: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}