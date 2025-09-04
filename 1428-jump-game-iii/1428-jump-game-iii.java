class Pair{
    int val,idx;
    Pair(int val,int idx)
    {
        this.val=val;
        this.idx=idx;
    }
}
class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Pair>qu=new LinkedList<>();
        boolean vis[]=new boolean[arr.length];
        vis[start]=true;
        qu.add(new Pair(arr[start],start));
        while(!qu.isEmpty())
        {   
            int val=qu.peek().val;
            int idx=qu.peek().idx;
            int front=idx+val;
            int back=idx-val;
            if(val == 0)
            {
                return true;
            }
            qu.poll();
            if(front < arr.length && front >=0 && !vis[front])
            {
            qu.add(new Pair(arr[front],front));
            vis[front]=true;

            }
            if(back < arr.length && back >=0 && !vis[back])
            {
            qu.add(new Pair(arr[back],back));
            vis[back]=true;

            }
        }
        return false;
    }
}