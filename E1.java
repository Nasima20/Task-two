package JavaP;

public class E1 {
    public static void main(String[] args) {
        String a="hello";
        String b="world";
        a = a + b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println("Strings after swap: a = " +
                a + " and b = " + b);
    }
}



//1.	Write a program to swap 2 String without a temporary variable?