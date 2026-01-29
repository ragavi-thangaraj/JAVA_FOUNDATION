//  Palindrome Triangle Pattern


public class Palindrome_Triangle {
    public static void main(String[] args) {
        int num;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" "+" ");
                
            }
            num=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num--;
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}


/* 
Output:

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5 

*/
