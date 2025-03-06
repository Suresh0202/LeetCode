class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       TreeMap<Integer,PriorityQueue<Integer>> map=new TreeMap<>();

       for(int i=0;i<arr.length;i++)
       {
            int a=Math.abs(x-arr[i]);
            if(!map.containsKey(a))
            {
                map.put(a,new PriorityQueue<>());
            }
            map.get(a).offer(arr[i]);
       }
       List<Integer>ans=new ArrayList<>();
       System.out.println(map);
       for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
                while(entry.getValue().size()!=0)
                {
                     ans.add(entry.getValue().peek());
                     entry.getValue().poll();
                      if(ans.size()==k)break;
                     
                }
               
                if(ans.size()==k)break;
        }
        Collections.sort(ans);
       return ans;
    }
}