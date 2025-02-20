class Solution {
    public static boolean func(String s,int []ch1)
    {
            int ch2[]=new int[26];
            for(int i=0;i<s.length();i++)
            {
                ch2[s.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                if(ch1[i] != ch2[i])
                {
                    return false;
                }
            }
            return true;
    }   
    public List<Integer> findAnagrams(String s, String p) {
        int phash[]=new int[26];
        for(int i=0;i<p.length();i++)
        {
            phash[p.charAt(i)-'a']++;
        }
        int k=p.length();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++)
        {
            String ss=s.substring(i,k);
            if(func(ss,phash))
            {
                arr.add(i);
            }
            k++;
        }
        return arr;
    }
}