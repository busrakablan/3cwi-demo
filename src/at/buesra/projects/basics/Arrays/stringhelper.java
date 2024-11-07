package at.buesra.projects.basics.Arrays;

public class stringhelper {
    public static void main(String[] args) {

        boolean isPalindrome = isPalindrome("anna");
        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        int amount = countLetters("Büsra", 'B');
        System.out.println(amount);

        String reversed = reverseString("hello");
        System.out.println(reversed);

        int amountOfLetters = getAmountOfLetters("sepp");
        System.out.println(amountOfLetters);


    }

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static int countLetters(String word, char c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }
            return count;
        }
    public static String reverseString(String word){
        return new StringBuilder(word).reverse().toString();
    }


    public static int getAmountOfLetters(String word){
        return word.length();
    }



    }

