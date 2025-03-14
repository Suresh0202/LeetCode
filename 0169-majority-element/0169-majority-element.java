class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        System.out.println(mp);
        int k=nums.length/2;
        for(Map.Entry<Integer,Integer>m:mp.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
            int key=m.getValue();
            if(key > k)
            {
                return m.getKey();
            }
        }
        return 0;
    }
}