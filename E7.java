package JavaP;

public class E7 {
    public static void main(String[] args) {
        String words="Hello, world!";

        int countWords = words.split("\\s").length;
        System.out.println(countWords);

        }

    }

//7.	Count the Number of Words in a String: Write a function to count the
// number of words in a given string. Words are separated by spaces or punctuation.
// For example, the input "Hello, world!" should return 2.