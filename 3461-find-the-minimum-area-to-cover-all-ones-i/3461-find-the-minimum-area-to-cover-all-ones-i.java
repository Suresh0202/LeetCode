class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxRow=0;
        int minRow=n-1;
        int minCol=m-1;
        int maxCol=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] == 1)
                {
                    maxRow=Math.max(maxRow,i);
                    minRow=Math.min(minRow,i);
                    maxCol=Math.max(maxCol,j);
                    minCol=Math.min(minCol,j);
                }
            }
        }
        int h=maxRow-minRow;
        int w=maxCol-minCol;
        h++;
        w++;
        return h*w;


    }
}