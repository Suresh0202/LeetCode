class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<m;i++)
            {
                ans.add(nums1[i]);
            }
            for(int i=0;i<n;i++)
            {
                ans.add(nums2[i]);
            }
            Collections.sort(ans);
            int ans1[]=new int[ans.size()];
            for(int i=0;i<ans.size();i++)
            {
                nums1[i]=ans.get(i);
            }
        
            }
}