class Solution {
    boolean func(StringBuilder sb,int ch2[])
    {
        int ch1[]=new int [26];
        String s=sb.toString();
        for(int i=0;i<sb.length();i++)
        {
                ch1[s.charAt(i)-'a']++;
        }
        // Sys/tem.out.println(Arrays.toString(ch1));
        // System.out.println(Arrays.toString(ch2));
       for(int i=0;i<26;i++)
       {
        if(ch1[i]!=ch2[i])
        {
            return false;
        }
        
       }
       return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        List<String>ar=new ArrayList<>();
        int r=0,l=0;
        int n=s2.length();
        //  char ch2[]=s1.toCharArray();
        //  Arrays.sort(ch2);
        int ch2[]=new int [26];
        // String s=sb.toString();
        for(int i=0;i<s1.length();i++)
        {
                ch2[s1.charAt(i)-'a']++;
        }
        StringBuilder ss=new StringBuilder();
        while(r<n)
        {
            ss.append(s2.charAt(r));
            r++;
            if(r-l == s1.length())
            {
              
                if(func(ss,ch2))
                {
                    return true;
                    // f=1;
                    // break;
                }
                ss.deleteCharAt(0);
              
                l++;
            }
            // r++;
        }
        return false;
    }
}