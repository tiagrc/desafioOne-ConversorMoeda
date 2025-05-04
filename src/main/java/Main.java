import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main{
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("\n*************************************\n");
        System.out.println("Bem vindo ao super convetor de moedas\n");
        System.out.print("""
                1 - Real -> Dolar
                2 - Dolar -> Real
                3 - Euro -> Dolar
                4 - Dolar -> Euro
                5 - Peso argentino -> Dolar
                6 - Dolar -> Peso argentino
                0 - Sair
                                      
                Escolha uma opção:\s""");
        opcao = sc.nextInt();
        do {
            switch (opcao) {
                case 1:
                    try {
                        double conversao = CurrencyConverterService.currencyApi("BRL", "USD");
                        System.out.print("Valor a ser convertido: ");
                        sc.nextLine();

                        String moedaString = sc.nextLine().replace(",", ".");
                        double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * conversao));
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Erro: moeda digitada inválida.");
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        double conversao = CurrencyConverterService.currencyApi("USD", "BRL");
                        System.out.print("Valor a ser converido: ");
                        sc.nextLine();

                        String moedaString = sc.nextLine().replace(",", ".");
                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * conversao));
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 3:
                    try {
                        double conversao = CurrencyConverterService.currencyApi("EUR", "USD");
                        System.out.print("Valor a ser converido: ");
                        sc.nextLine();

                        String moedaString = sc.nextLine().replace(",", ".");
                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * conversao));
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 4:
                    try {
                        double conversao = CurrencyConverterService.currencyApi("USD", "EUR");
                        System.out.print("Valor a ser converido: ");
                        sc.nextLine();

                        String moedaString = sc.nextLine().replace(",", ".");
                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * conversao));
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 5:
                    try {
                        double conversao = CurrencyConverterService.currencyApi("ARS", "USD");
                        System.out.print("Valor a ser converido: ");
                        sc.nextLine();

                        String moedaString = sc.nextLine().replace(",", ".");
                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * conversao));
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
                case 6:
                    try {
                        double conversao = CurrencyConverterService.currencyApi("USD", "ARS");
                        System.out.print("Valor a ser converido: ");
                        sc.nextLine();

                        String moedaString = sc.nextLine().replace(",", ".");
                        Double moeda = Double.parseDouble(moedaString);

                        String texto = String.format("O valor de R$ %.2f convertido é: %.2f", moeda, (moeda * conversao));
                    } catch (NumberFormatException | NullPointerException e) {
                        System.out.println("Erro: Valor digitado é inválido.");
                    }
                    break;
            }
        } while (opcao !=0);


        sc.close();
    }
}