class Solution {
    public static boolean func(int id,String s,List<String>l,int n,HashMap<Integer,Boolean>dp)
    {
        if(id == n)
        {
            
            return true;
        }
        if(dp.containsKey(id))
        {
            return dp.get(id);
        }
        for(int i=id;i<n;i++)
        {
            String ss=s.substring(id,i+1);
            System.out.println(ss);
            if(l.contains(ss))
            {
              if(func(i+1,s,l,n,dp)){
                dp.put(id,true);
                return true;
              }
            }
        }
        dp.put(id,false);
        return false;
    }
    public boolean wordBreak(String s, List<String> l) {
        HashMap<Integer,Boolean>dp=new HashMap<>();
       return  func(0,s,l,s.length(),dp);
    }
}