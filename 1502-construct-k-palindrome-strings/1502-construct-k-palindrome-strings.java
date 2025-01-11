class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k){
        return false;
        }
        HashMap<Character,Integer>mapp=new HashMap<>();
        char ch[]=s.toCharArray();
        for(char chh:ch)
        {
             mapp.put(chh,mapp.getOrDefault(chh,0)+1);
        }
        // System.out.println(mapp); 
        Set<Character> keys = mapp.keySet();
        int p=0;
        int o=0;
         for(char c:keys)
        {
            p=(mapp.get(c));
            if(p%2!=0)
            {
                o++;
            }
        }
        if(o>k) return false;
        return true;
    }
}