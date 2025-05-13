class Solution {
  
    public void f(int i,int[] nums,HashSet<List<Integer>>ans,List<Integer>l,int prev){
        if(i == nums.length)
        {
            if(l.size()>=2)
            {
                ans.add(new ArrayList<>(l));
                return;
            }
            return ;
        }
        if(nums[i] >= prev)
        {
            l.add(nums[i]);
            f(i+1,nums,ans,l,nums[i]);
            l.remove(l.size()-1);
        }
        f(i+1,nums,ans,l,prev);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> l=new ArrayList<>();
          HashSet<List<Integer>> ans=new HashSet<>();
        f(0,nums,ans,l,Integer.MIN_VALUE);
        System.out.println(ans);
        List<List<Integer>>fina=new ArrayList<>();
        for(List<Integer>a:ans)
        {
            fina.add(a);
        }
        return fina;
    }
}