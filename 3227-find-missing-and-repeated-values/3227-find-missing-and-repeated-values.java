class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[grid.length*grid.length];
        int k=0;
        int max=grid.length*grid.length;
           int hash[]=new int[max+1];
             hash[0]=-1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                // arr[k++]=grid[i][j];
                hash[grid[i][j]]++;
            }
        }
        // int hash[]=new int[max+1];
        // hash[0]=-1;
        // for(int i=0;i<arr.length;i++)
        // {
        //     hash[arr[i]]++;
        // }
        // System.out.println(Arrays.toString(arr));
        int ans[]=new int[2];
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                ans[1]=i;
            }
            if(hash[i]==2)
            {
                ans[0]=i;
            }
        }
        System.out.println(Arrays.toString(hash));
        return ans;
    }
}