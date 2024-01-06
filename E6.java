package JavaP;

public class E6 {
    public static void main(String[] args) {
        String s="documentation";
        int countVowel=0;
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='e'||c=='u'||c=='o'){
                countVowel++;
            }


    }
        if(countVowel==0){
            System.out.println("no vowel");
        }else {
            System.out.println(countVowel);
        }
}}
//6.	Create	a	method	to	count	how	many	vowels	are	present	in	a	string
//“documentation”