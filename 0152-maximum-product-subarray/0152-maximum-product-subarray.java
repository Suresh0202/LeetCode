class Solution {
    public int maxProduct(int[] nums) {
        int pro=0;
        int max=Integer.MIN_VALUE;
        int n = nums.length;
        int ans=Integer.MIN_VALUE;
        int pro1=0;
        for(int i=0;i<nums.length;i++)
        {
           
            if(pro  == 0)
            {
                pro=1;
            }
            if(pro1 == 0)
            {
                pro1=1;
            }
            pro*=nums[i];
            pro1*=nums[n-i-1];
            max= Math.max(pro,pro1);
            ans=Math.max(ans,max);
        }   
        return ans;
    }

}