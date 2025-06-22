class Solution {
    void func(int idx,List<List<String>>ans ,List<String>path,String s)
    {
        if(idx == s.length())
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();i++)
        {
            if(isPalin(s.substring(idx,i+1)))
            {
                path.add(s.substring(idx,i+1));
                func(i+1,ans,path,s);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalin(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        func(0,ans,path,s);
        return ans;
    }
}