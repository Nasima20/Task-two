package JavaP;

public class E4 {
    public static void main(String[] args) {
        String s="madam";
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);}
            if (s.equals(rev)){
                System.out.println("palindrome");
            }else {
                System.out.println("not palindrome");
            }
        }

    }

//4.	Check if a String is Palindrome: Determine whether a given string
// is a palindrome, which means it reads the
// same forwards and backward. For example, "madam" is a palindrome.