package MVCcrypt;

public class Model {

        String message = "Dubbel";
        String key = "Pipa";


        public void setMessage(String message) {
            this.message = message;
        }
        public void setKey(String key) {
            this.key = key;
        }

    public String cryptString() {
        String resultat = "";

        while (key.length() < message.length()) {
            key = expandKey(key);
        }
        for (int i = 0 ; i < message.length() ; i++) {
            resultat += (char)crypt(message.charAt(i), key.charAt(i));
        }
        return resultat;
    }

    public String binärString() {
        String binärt = "";

        while (key.length() < message.length()) {
            key = expandKey(key);
        }
        for (int i = 0 ; i < message.length() ; i++) {
            binärt += crypt(message.charAt(i), key.charAt(i));
        }
        return binärt;
    }

    public int crypt(int m, int k) {
        return m^k;
    }

    public String expandKey(String s) {
        return s + s;


    }
    public static void main(String[] args) {
        Model cryptModel = new Model();
        System.out.println(cryptModel.cryptString());
        System.out.println(cryptModel.binärString());
    }
}
