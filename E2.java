package JavaP;

public class E2 {
    public static void main(String[] args) {
        String E="Hello batch 18,how are you";
        int countAlphaNumber=0;
        for (int i =0;i<E.length();i++){
            if (Character.isAlphabetic(E.charAt(i))){
                countAlphaNumber++;
            }
        }
        System.out.println(countAlphaNumber);
    }
}
//2.	Find out how many alpha characters are present in a string?