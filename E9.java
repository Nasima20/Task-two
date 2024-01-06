package JavaP;

public class E9 {
    public static void main(String[] args) {
        String str1="abracadabra";

        for (int i = 0; i < str1.length(); i++) {
            boolean NonRepeating = true;
            for (int j = 0; j < str1.length(); j++) {
                if (i != j && str1.charAt(i) == str1.charAt(j)) {
                    NonRepeating = false;
                    break;
                }
            }
            if (NonRepeating) {
                System.out.println("The first non-repeated character in the String is: " + str1.charAt(i));
                break;
            }
        }
    }
}
//9.	Find the First Non-Repeating Character in a String: Given a string,
// find and return the first non-repeating character. For example,
// in the string "abracadabra", the first non-repeating character is 'c'.