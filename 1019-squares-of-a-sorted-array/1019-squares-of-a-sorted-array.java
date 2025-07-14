class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int n=ans.length;
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j && k>=0)
        {
            if(Math.abs(nums[i]) < Math.abs(nums[j]))
            {
                int ele=Math.abs(nums[j]);
                ans[k--]=(ele*ele);
                j--;
            }else
            {
                 int ele=Math.abs(nums[i]);
                ans[k--]=(ele*ele);
                i++;
            }

        }
        return ans;
    }
}