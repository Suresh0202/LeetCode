class Solution {
    void permute(List<List<Integer>>ans,List<Integer>ds,int nums[],boolean []freq)
    {
        if(ds.size() == nums.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!freq[i])
            {
                freq[i]=true;
                ds.add(nums[i]);
                permute(ans,ds,nums,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        permute(ans,ds,nums,freq);
        return ans;
    }
}