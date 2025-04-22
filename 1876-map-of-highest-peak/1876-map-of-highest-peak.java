    class Pair{
        int sr,sc,val;
        Pair(int sr,int sc,int val)
        {
            this.sr=sr;
            this.sc=sc;
            this.val=val;
        }
    }
    class Solution {
        public boolean CheckBoundary(int i,int j,int n,int m,int isw[][],int vis[][])
        {
            if(i>=0 && j>=0 && i<=n  && j<=m && isw[i][j]==0 && vis[i][j]!=1)
            {
                return true;
            }
            return false;
        }
        public int[][] highestPeak(int[][] isw) {
            int n=isw.length;
            int m=isw[0].length;
            int vis[][]=new int[n][m];
            Queue<Pair>qu=new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(isw[i][j]==1)
                    {
                        isw[i][j]=0;
                        qu.add(new Pair(i,j,1));
                        vis[i][j]=1;
                    }
                }
            }
            while(!qu.isEmpty())
            {
                int sr=qu.peek().sr;
                int sc=qu.peek().sc;
                int val=qu.peek().val;
                qu.remove();
                if(CheckBoundary(sr-1,sc,n-1,m-1,isw,vis))
                {
                    qu.add(new Pair(sr-1,sc,val+1));
                    isw[sr-1][sc]=val;
                    vis[sr-1][sc]=1;
                }
                if(CheckBoundary(sr+1,sc,n-1,m-1,isw,vis))
                {
                    qu.add(new Pair(sr+1,sc,val+1));
                    isw[sr+1][sc]=val;
                    vis[sr+1][sc]=1;
                }
                if(CheckBoundary(sr,sc+1,n-1,m-1,isw,vis))
                {
                    qu.add(new Pair(sr,sc+1,val+1));
                    isw[sr][sc+1]=val;
                    vis[sr][sc+1]=1;
                }
                if(CheckBoundary(sr,sc-1,n-1,m-1,isw,vis))
                {
                    qu.add(new Pair(sr,sc-1,val+1));
                    isw[sr][sc-1]=val;
                    vis[sr][sc-1]=1;
                }
                
            }
            return isw;


        }
    }