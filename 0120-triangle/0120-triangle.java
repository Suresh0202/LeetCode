class Solution {
    public int func(int i,int j,int n, List<List<Integer>>arr,int dp[][])
    {
        
        if(i == n-1 )
        {
            return arr.get(i).get(j); 
        }
       
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        
        int l=0,r=0;
        l=arr.get(i).get(j)+func(i+1,j,n,arr,dp);
        r=arr.get(i).get(j)+func(i+1,j+1,n,arr,dp);
        return dp[i][j]=Math.min(l,r);
    }
    public int minimumTotal(List<List<Integer>> tr) {
        int n=tr.size();
        int m=tr.get(0).size();
        int dp[][]=new int[tr.size()+1][tr.size()];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return func(0,0,n,tr,dp);
    }
}