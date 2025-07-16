class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>st1=new HashSet<>();
        Set<Integer>st2=new HashSet<>();
        for(int i:nums1)st1.add(i);
        for(int i:nums2)st2.add(i);
        List<List<Integer>>ans=new ArrayList<>();
        // ans.add(new ArrayList<>());
        // ans.add(new ArrayList<>());
        List<Integer>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        for(int i:st1)
        {
            if(st2.contains(i))
            {

            }else
            {
                a.add(i);
            }
        }
        ans.add(a);
        for(int i:st2)
        {
            if(st1.contains(i))
            {

            }else
            {
                b.add(i);
            }
        }
        ans.add(b);
        return ans;
    }
}