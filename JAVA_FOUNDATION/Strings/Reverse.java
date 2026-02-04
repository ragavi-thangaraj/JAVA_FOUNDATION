package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the original string: "+" ");
        String s=sc.next();
        String s1= new String();
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        System.out.println("Original String: "+s);
        System.out.println("Reversed String: "+s1);
    }
    
}

/*

Enter the original string:  athik
Original String: athik
Reversed String: kihta

*/