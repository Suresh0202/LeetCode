class Solution {
    public static void func(String p,String up,HashSet<String>st)
    {
        if(!up.isEmpty())
        {
            st.add(up);
        }
        if(p.isEmpty())
        {
            return ;
        }
        for(int i=0;i<p.length();i++)
        {
            char ch=p.charAt(i);
            String l=p.substring(0,i)+p.substring(i+1);
            func(l,up+ch,st);
        }
    }
    public int numTilePossibilities(String t) {
        HashSet<String>st=new HashSet<>();
       func(t,"",st);
        return st.size();
    }
    
}