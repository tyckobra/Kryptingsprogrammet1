package MVCcalculator;

public class CalculatorModel {

    int Value;
    String message;
    String key;

    public int CryptMessageKey() {
        for (int i = 0 ; i < message.length() ; i++) {
            Value += crypt(message.charAt(i), key.charAt(i));
        }
        return 0;
    }

    public int getValue() {
        return Value;
    }

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        System.out.println(model.CryptMessageKey());
        model.CryptMessageKey();
        System.out.println(model.getValue());
    }
    public int crypt(int m, int k) {
        return m^k;
    }

}
