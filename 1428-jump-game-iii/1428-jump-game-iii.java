class Pair{
    int idx;
    int val;
    Pair(int idx,int val)
    {
        this.idx=idx;
        this.val=val;
    }
}
class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Pair>qu=new LinkedList<>();
        qu.add(new Pair(start,arr[start]));
        boolean vis[]=new boolean[arr.length];
        vis[start]=true;
        while(!qu.isEmpty())
        {
            int val=qu.peek().val;
            int idx=qu.peek().idx;
            int front=idx+val;
            int back=idx-val;
            if(idx == 0)
            {
                return true;
            }
            qu.poll();
            if( front>=0 && front< arr.length && !vis[front])
            {
                qu.add(new Pair(front,arr[front]));
                vis[front]=true;
            }
            if(back>=0 && back <arr.length && !vis[back])
            {
                qu.add(new Pair(back,arr[back]));
                vis[back]=true;
            }
        }
        return false;
    }
}