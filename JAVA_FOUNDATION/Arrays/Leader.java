package Arrays;

public class Leader {
    public static void main(String[] args) {
        int[] nums={16,17,4,3,5,2};
        int flag=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>nums[i])
                {
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
            }
            if(flag==0)
            {
                System.out.print(nums[i]+" ");
            }
            else{
                continue;
            }
        }

    }
    
}
