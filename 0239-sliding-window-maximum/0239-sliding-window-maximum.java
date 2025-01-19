class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
       int ans[]=new int[n-k+1];
       TreeMap<Integer,Integer>map=new TreeMap<>();
       int i=0;
       int j=0;
       while(j<n)
       {
        map.put(arr[j],map.getOrDefault(arr[j],0)+1);
        if((j-i+1)>=k)
        {
            ans[i]=map.lastKey();
            if(map.get(arr[i])>1)
            {
                map.put(arr[i],map.get(arr[i])-1);
            }else
            {
                map.remove(arr[i]);
            }
            i++;
        }
        j++;
       }
       return ans;

        // return ans;
    }
}