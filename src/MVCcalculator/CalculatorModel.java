package MVCcalculator;

public class CalculatorModel {

    int Value;
    String message = "Trippel";
    String key = "Rör";

    public void CryptMessageKey(String message, String key) {
        for (int i = 0 ; i < message.length() ; i++) {
            Value += crypt(message.charAt(i), key.charAt(i));
        }
    }

    public String getValue(int message, int key) {
        return Value;
    }

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        model.CryptMessageKey(model.message, model.key);
        System.out.println(model.getValue());
    }
    public int crypt(int m, int k) {
        return m^k;
    }

}
