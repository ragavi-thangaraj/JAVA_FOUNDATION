// Leetcode question : 344. Reverse String

package Arrays;

import java.util.Scanner;

public class Reverse_CharArray {
    public static void main(String[] args) {

        // For purpose running it here get user input as character array
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = sc.nextLine();   

        // Convert String to char array
        char[] s = input.toCharArray();

        char temp;
        int i=0;
        int j=s.length-1;

        while(i<j)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

        System.out.print("[");
        for(int k=0;k<s.length;k++)
        {
            System.out.print("\""+s[k]+"\"");
            if(k<s.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
    
}

/* 
Code of leetcode driver method:

class Solution {
    public void reverseString(char[] s) {
        char temp;
        int i=0;
        int j=s.length-1;

        while(i<j)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

        System.out.print("[");
        for(int k=0;k<s.length;k++)
        {
            System.out.print("\""+s[k]+"\"");
            if(k<s.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
    
*/