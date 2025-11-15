class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,List<Integer>>mp=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch,new ArrayList<>());
            }
            mp.get(ch).add(i);
       }
       int ans=Integer.MAX_VALUE;
       System.out.println(mp);
       for(char ch:mp.keySet())
       {
            if(mp.get(ch).size() == 1)
            {
                ans=Math.min(ans,mp.get(ch).get(0));
            }
       }
        if(ans == Integer.MAX_VALUE)return -1;
       return ans;

    }
}