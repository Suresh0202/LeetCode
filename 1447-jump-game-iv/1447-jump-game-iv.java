class Solution {
    public int minJumps(int[] arr) {
        HashMap<Integer,List<Integer>>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],new ArrayList<>());
            }
            mp.get(arr[i]).add(i);
        }
        System.out.println(mp);
        Queue<int[]>qu=new LinkedList<>();
        qu.add(new int[]{0,0});
        int vis[]=new int[arr.length];
        vis[0]=1;
        while(!qu.isEmpty())
        {
            int ar[]=qu.poll();
            int i=ar[0];
            int dist=ar[1];
            if(i == arr.length -1)
            {
                return dist;
            }
            if(i+1 < arr.length && vis[i+1] != 1)
            {
                vis[i+1]=1;
                qu.add(new int[]{i+1,dist+1});
            }
            if(i-1 >=0 && vis[i-1] != 1)
            {
                vis[i-1]=1;
                qu.add(new int[]{i-1,dist+1});
            }
            if(mp.containsKey(arr[i]))
            {
                List<Integer>x=mp.get(arr[i]);
                for(int y=0;y<x.size();y++)
                {
                    if(x.get(y) != i && vis[x.get(y)] != 1)
                    {
                        vis[x.get(y)]=1;
                        qu.add(new int[]{x.get(y),dist+1});
                    }
                }
            }
            mp.remove(arr[i]);

        }
        return -1;
    }
}