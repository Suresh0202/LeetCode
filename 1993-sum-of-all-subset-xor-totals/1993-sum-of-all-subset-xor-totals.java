class Solution {
    public int subsetXORSum(int[] nums) {
       	int sum=0;
        int n=nums.length;
		for(int i=0;i<(1<<n);i++)
		{
		    int xor=0;
		    for(int j=0;j<n;j++)
		    {
		      //  ans.add(nums[i]);
		         if ((i & (1 << j)) > 0)
                    // ans.add(nums[j]);
                   xor=xor^nums[j];
		    }
		    sum+=xor;
		   // System.out.println(ans);
		}
        return sum;
    }
}