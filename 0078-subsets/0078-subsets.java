class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void func(int nums[],int idx,int n,List<Integer>sub)
    {
        if(idx == n)
        {
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[idx]);
        func(nums,idx+1,n,sub);
        sub.remove(sub.size()-1);
        func(nums,idx+1,n,sub);

    }
    public List<List<Integer>> subsets(int[] nums) {
        //  List<List<Integer>>ans=new ArrayList<>();
        List<Integer>sb=new ArrayList<>();
        func(nums,0,nums.length,sb);
        return ans;

        
    }
}