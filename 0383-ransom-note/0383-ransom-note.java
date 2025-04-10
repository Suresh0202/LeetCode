class Solution {
    public boolean canConstruct(String rs, String ms) {
        int hash[]=new int[26];
        for(int i=0;i<rs.length();i++)
        {
            hash[rs.charAt(i)-'a']++;
        }
        int hash1[]=new int[26];
        for(int i=0;i<ms.length();i++)
        {
            hash1[ms.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            int a=hash[i];
            int b=hash1[i];
            if(a!=0 && b==0)
            {
                return false;
            }
            if(b<a)
            {
                return false;
            }

        }
        return true;

    }
}