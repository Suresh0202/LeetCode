class Solution {
     boolean inc(int nums[],int a,int b)
    {
     
        for(int i=a;i<b;i++)
        {
            if(!(nums[i]<nums[i+1]))
            {
                return false;
            }
        }
        return true;
    }
    int s(int nums[],int a,int b)
    {
        int sum=0;
        for(int i=a;i<=b;i++)
        {
          
            sum+=nums[i];
        }

        return sum;
    }
    public int maxAscendingSum(int[] nums) {
          int m=0;
        for(int i=0;i<nums.length;i++)
        {
            // int ans=0;
            // int ans1=0;
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                if(inc(nums,i,j))
                {
                    
                    int k=s(nums,i,j);
                    m=Math.max(m,k);
                }
            }
            

        }
        return m;
    }
}