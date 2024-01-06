package JavaP;

import java.util.ArrayList;
import java.util.Arrays;

public class E10 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,3,4,1,1,4,5,5,6,7,2,3,5,7,6,6,6));

        ArrayList<Integer> newarr=new ArrayList<>();
        for(int i=0;i<arr.size();i++){

            if(newarr.contains(arr.get(i))==false)
                newarr.add(arr.get(i));
        }

        System.out.println("Original Array -> "+ arr);

        System.out.println("New Array with No duplicate Elements  "+newarr+" ");
    }
}


//10.	How can you remove all duplicates from ArrayList?