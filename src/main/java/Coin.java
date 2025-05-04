import com.google.gson.annotations.SerializedName;

public class Coin {
    @SerializedName("conversion_rates")
    private String coin;
    private double value;

    public double getValue(){
        return value;
    }

    public void setValue (double value){
        this.value = value;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return "Moeda selecionada = " + coin;
    }

}
