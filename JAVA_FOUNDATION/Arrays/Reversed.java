/* Take an array of integers and reverse it */

package Arrays;

/* public class Reversed {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    
} */

public class Reversed {
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,6};
        int left=0;
        int right=arr.length-1;
        int temp;

        while(left<right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        for(int num: arr)
        {
            System.out.print(num+" ");
        }
        
    }
    
} 