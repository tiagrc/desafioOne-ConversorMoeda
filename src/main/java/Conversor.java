import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("Bem vindo/a ao conversor de moedas!");
        System.out.println("1 - De dolar ->> real");
        System.out.println("2 - De real ->> dolar");
        System.out.println("3 - De dolar ->> peso (ARG)");
        System.out.println("4 - De peso (ARG) ->> dolar");
        System.out.println("5 - De dolar ->> peso (COL)");
        System.out.println("6 - De peso (COL) ->> dolar");
        System.out.println("0 - Sair");
        System.out.println("Escolha uma opção: ");
        short opcaoEscolhida = sc.nextShort();
        System.out.println("********************************");

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/60be745fe9b1f20f341e7595/latest/BRL" );
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        if (opcaoEscolhida == 1){

        }

        System.out.println(response.body());


        sc.close();
    }
}
