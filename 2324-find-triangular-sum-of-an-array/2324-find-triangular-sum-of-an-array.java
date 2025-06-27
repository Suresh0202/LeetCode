class Solution {
    public int triangularSum(int[] nums) {
        // List<Integer>arr=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(nums[i]);
        }
        if(a.size() == 1)return a.get(0);
        int cnt=0;
        int ans=0;
        while(cnt<nums.length-1)
        {
            List<Integer>ar=new ArrayList<>();
            for(int j=1;j<a.size();j++)
            {
                int val=(a.get(j)+a.get(j-1))%10;
                ar.add(val);
            }
            // System.out.println(ar);
            a=ar;
            cnt++;
            // if(ar.size()==1)
            {
            ans=ar.get(ar.size()-1);
            }
        }
        return ans;
    }
}