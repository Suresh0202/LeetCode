class Solution {
    public static boolean func(int nums[],int st,int end,int ins)
    {
        int s1=0,s2=0;
        for(int i=st;i<=end;i++)
            {
                s1+=nums[i];
            }
        for(int i=ins;i<nums.length;i++)
            {
                s2+=nums[i];
            }
        if((s1-s2)%2==0)
        {
            return true;
        }
        return false;
    }
    public int countPartitions(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
            {
                if(func(nums,0,i,i+1)){
                    c++;
                }
                
            }
        if(c==0)
        {
            return 0;
        }
        return c-1;
    
    }
}