class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[]=new char[26];
        char ch2[]=new char[26];
        for(int i=0;i<s.length();i++)
        {
            ch1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            ch2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            // if(ch1[i]!=0)
            // {
                if(ch1[i] != ch2[i])
                {
                    return false;
                }else if(ch1[i]!=0 && ch2[i]==0)
                {
                    return false;
                }else if(ch2[i]!=0 && ch1[i]==0)
                {
                    return false;
                }
            

        }
        return true;
    }
}