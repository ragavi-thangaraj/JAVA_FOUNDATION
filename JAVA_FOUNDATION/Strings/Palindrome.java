package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String1: "+" ");
        String str = sc.next().toLowerCase();
        String str1 = new String();

        for(int i = str.length()-1; i >= 0; i--) {
            str1 += str.charAt(i);
        }

        
        if(str.equals(str1.toLowerCase())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
