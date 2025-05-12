class Solution {
    int func(int arr[][],int i,int j,int prev,int vis[][])
    {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length ||  arr[i][j]<=prev)
        {
            return 0;
        }
        if(vis[i][j]!=-1)
        {
            return vis[i][j];
        }
        int c=0;
            c=Math.max(c,func(arr,i+1,j,arr[i][j],vis));
            c=Math.max(c,func(arr,i-1,j,arr[i][j],vis));
            c=Math.max(c,func(arr,i,j+1,arr[i][j],vis));
            c=Math.max(c,func(arr,i,j-1,arr[i][j],vis));
        return vis[i][j]=1+c;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int vis[][]=new int[n][m];
        int  ans=0;
        for(int i=0;i<n;i++)
        {
            Arrays.fill(vis[i],-1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans=Math.max(ans,func(matrix,i,j,Integer.MIN_VALUE,vis));
            }
        }
        // int ''
        for(int i=0;i<n;i++)
        {
            System.out.println(Arrays.toString(vis[i]));
        }
        return ans;
    }
}