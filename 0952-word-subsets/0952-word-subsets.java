class Solution {
    public static boolean func(String s,int hash2[])
    {
        int hash1[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hash1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(hash1[i]<hash2[i])
            {
                return false;
            }
        }
        
        return true;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int hash[]=new int[26];
        List<String>l=new ArrayList<>();
        for(int i=0;i<words2.length;i++)
        {
            int fre[]=new int[26];
            String s=words2[i];
            for(int f=0;f<s.length();f++)
            {
                fre[s.charAt(f)-'a']++;
            }
            for(int h=0;h<26;h++)
            {
                hash[h]=Math.max(hash[h],fre[h]);
            }
        }
        for(int i=0;i<words1.length;i++)
        {
            if(func(words1[i],hash))
            {
                l.add(words1[i]);
            }
        }
        // System.out.println(Arrays.toString(hash));
        return l;
    }
}