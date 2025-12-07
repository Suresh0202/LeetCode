class Solution {
    public int[] sortByReflection(int[] nums) {
        int arr[]=new int[nums.length];
        TreeMap<Integer,List<Integer>>mp=new TreeMap<>();
        for(int i=0;i<nums.length;i++)
            {
                String s=Integer.toBinaryString(nums[i]);
                StringBuilder sb=new StringBuilder(s);
                sb=sb.reverse();
                int dec = Integer.parseInt(sb.toString(), 2);
                arr[i]=dec;
            }
        for(int i=0;i<nums.length;i++)
            {
                if(!mp.containsKey(arr[i]))
                {
                    mp.put(arr[i],new ArrayList<>());
                }
                mp.get(arr[i]).add(nums[i]);
            }
        int res[]=new int[arr.length];
        int k1=0;
        System.out.println(mp);
        for(int k:mp.keySet()){
            List<Integer>ar=mp.get(k);
            Collections.sort(ar);
            for(int i=0;i<ar.size();i++){
                res[k1++]=ar.get(i);
            }
        }
    
        return res;
    }
}