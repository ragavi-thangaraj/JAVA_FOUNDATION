package Arrays;

public class Initialization {
    public static void main(String[] args) {
        int[] arr=new int[5];
        // The variable is stored in the stack memory
        System.out.println(arr);
        //  [I@5acf9800  - only reference will be printed 

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);  
        }
    }
    
}
