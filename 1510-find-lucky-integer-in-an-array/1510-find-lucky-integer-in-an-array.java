class Solution {
    public int findLucky(int[] arr) {
        int max=0;
        for(int i:arr)max=Math.max(i,max);
        int hash[]=new int[max+1]; 
        for(int i=0;i<arr.length;i++)
        {
            hash[arr[i]]++;
        } 
        int ans=-1;
        System.out.println(Arrays.toString(hash));
        for(int i=0;i<hash.length;i++)
        {
            if( hash[i] != 0 && hash[i] == i)
            {
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}