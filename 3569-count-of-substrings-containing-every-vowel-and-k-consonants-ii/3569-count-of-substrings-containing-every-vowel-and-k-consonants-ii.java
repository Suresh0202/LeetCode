class Solution {
    public boolean isVowel(char ch)
    {
        return (ch =='a' ||  ch=='e'|| ch=='i' || ch=='o' || ch == 'u');
    }
    public long hii(String s,int k)
    {
        HashMap<Character,Integer>mp=new HashMap<>();
        long ans=0;
        int r=0,l=0,n=s.length();
        long cns=0;
        while(r<n)
        {
            char ch=s.charAt(r);
            
            if(isVowel(ch))
            {
                mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
            else
            {
                cns++;
            }
            while(cns>=k && mp.size()==5)
            {
                ans+=(n-r);
                char ch1=s.charAt(l);
                if(isVowel(ch1))
                {
                    mp.put(ch1,mp.get(ch1)-1);
                    if(mp.get(ch1)==0)
                    {
                        mp.remove(ch1);
                    }
                }else
                {
                    cns--;
                }
                l++;
            }
            r++;
        }
        return ans;
    }
    public long countOfSubstrings(String s, int k) {
        
        return hii(s,k)-hii(s,k+1);
    }
}