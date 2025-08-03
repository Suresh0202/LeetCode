class Solution {
    public boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }   
        return true;
    }
    public void solve(String s,int idx,int n,List<String>path,List<List<String>>ans)
    {
        if(idx == n)
        {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<n;i++)
        {
            if(isPalindrome(s.substring(idx,i+1)))
            {
                path.add(s.substring(idx,i+1));
                solve(s,i+1,n,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>path=new ArrayList<>();
        solve(s,0,s.length(),path,ans);
        return ans;
    }
}