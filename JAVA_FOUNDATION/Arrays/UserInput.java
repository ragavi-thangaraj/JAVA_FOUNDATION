package Arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Students(Array size):"+" ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Grade of Student"+" "+i+"(array element):"+" ");
            int val=sc.nextInt();
            arr[i]=val;
        }
        for(int num:arr)
        {
            sum+=num;
        }
        System.out.print("The Average marks of students:"+" ");
        System.out.print(sum/n);
    }
    
}
