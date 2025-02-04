class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
         PriorityQueue<Map.Entry<Integer, Integer>>qu = new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
           for(Map.Entry<Integer,Integer>val : mp.entrySet()){
            qu.add(val);
            if(qu.size()>k){
                qu.poll();
            }
        }
        System.out.println(qu);
         int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = qu.poll().getKey();
        }
        return arr;
    }
}