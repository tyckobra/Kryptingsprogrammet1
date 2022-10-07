public class Model {
    public static void main(String[] args) {
        String m = "Dubbel";
        String k = "Pipa";

        Model cryptModel = new Model();
        //System.out.println((char)cryptModel.crypt(m,k));
        System.out.println(cryptModel.cryptString(m,k));
        System.out.println(cryptModel.binärString(m,k));
    }

    public String cryptString(String message, String key) {
        String resultat = "";

        while (key.length() < message.length()) {
            key = expandKey(key);
        }
        for (int i = 0 ; i < message.length() ; i++) {
            resultat += (char)crypt(message.charAt(i), key.charAt(i));
        }
        return resultat;
    }

    public String binärString(String message, String key) {
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

    public String expandKey(String s){
            return s+s;
    }
}
