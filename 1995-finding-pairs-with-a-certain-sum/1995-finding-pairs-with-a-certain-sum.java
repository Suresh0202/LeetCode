class FindSumPairs {
    List<Integer>n1;
    List<Integer>n2;
    int cnt=0;
    HashMap<Integer,Integer>mp;
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1=new ArrayList<>();
        mp=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            n1.add(nums1[i]);
        }
         n2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            n2.add(nums2[i]);
        }
         for(int i=0;i<n2.size();i++)
        {
            mp.put(n2.get(i),mp.getOrDefault(n2.get(i),0)+1);
        }
        
    }
    
    public void add(int index, int val) {
       int oldVal = n2.get(index);
        int newVal = oldVal + val;
        mp.put(oldVal, mp.get(oldVal) - 1);
        if (mp.get(oldVal) == 0) {
            mp.remove(oldVal);
        }
          n2.set(index, newVal);
          mp.put(newVal, mp.getOrDefault(newVal, 0) + 1);

    }
    
    public int count(int tot) {
      cnt=0;
        // System.out.println(n1 +" " + n2);
        
        // HashMap<Integer,Integer>mp=new HashMap<>();
        // for(int i=0;i<n2.size();i++)
        // {
        //     mp.put(n2.get(i),mp.getOrDefault(n2.get(i),0)+1);
        // }
            for(int i=0;i<n1.size();i++)
            {
               int tar=tot-n1.get(i);
               if(mp.containsKey(tar))
               {
                cnt+=mp.get(tar);
               }
            }
            return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */