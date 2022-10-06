public class Model {
    public static void main(String[] args) {
        String m = "Dubbel";
        String k = "Pipa";

        Model cryptModel = new Model();
        System.out.println(cryptModel.cryptString(m,k));
    }
    public String cryptString(String message, String key) {
        String resultat = "";
        while (key.length() < message.length()) {
            key = expandKey(key);
        }
        for (int i = 0 ; i < message.length() ; i++) {
            resultat += (char)crypt(message.chatAt(i), key.charAt(i));
        }
        return resultat;
    }

    public int crypt(String m, String k) {
        return m^k;
    }

    public int expandKey{
        if (message.length > key.length) {
            key+key;
        }

    }
}
