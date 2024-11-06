package at.buesra.projects.basics.Arrays;

public class caeser {
    public static void main(String[] args) {
        String result = encrypt("xyz");
        System.out.println(result);


        String res = decrypt(result);
        System.out.println(res);
        //expected cde
    }

    public static String encrypt(String data) {
        char[] letters = data.toCharArray();
        for (int i = 0; i < data.length(); i++) {
            letters[i] = (char) (letters[i] + 2);
            if (letters[i] > 122) {
                letters[i] = (char) (letters[i] - 26);
            }
        }


        String newString = new String(letters);
        return newString;


    }

    public static String decrypt(String data) {

        char[] letters = data.toCharArray();
        for (int i = 0; i < data.length(); i++) {
            letters[i] = (char) (letters[i] - 2);
            if (letters[i] < 97) {
                letters[i] = (char) (letters[i] + 26);


            }
        }
        String newString = new String(letters);
        return newString;
    }
}
