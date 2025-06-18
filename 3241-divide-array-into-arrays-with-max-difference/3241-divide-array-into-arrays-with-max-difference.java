class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3)
        {
            if(nums[i+2]- nums[i] > k)
            {
                 return new int[0][];
            }else
            {
                List<Integer>a=new ArrayList<>();
                a.add(nums[i]);
                a.add(nums[i+1]);
                a.add(nums[i+2]);
                ans.add(a);
            }
        }
        int ans1[][]=new int[ans.size()][ans.get(0).size()];
        for(int i=0;i<ans1.length;i++)
        {
            for(int j=0;j<ans1[0].length;j++)
            {
                ans1[i][j]=ans.get(i).get(j);
            }
        }
        return ans1;
    }
}