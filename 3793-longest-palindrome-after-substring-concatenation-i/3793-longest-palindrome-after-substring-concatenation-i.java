class Solution {
    public boolean isPailn(String s)
    {
        int i=0;
        int n=s.length();
        while(i<(n/2))
        {
            if(s.charAt(i)!=s.charAt(n-i-1))return false;
            i++;
        }
        return true;
    }
    public void findsubstring(String s,List<String>arr)
    {
        for(int i=0;i<s.length();i++)
        {
            String ss="";
            for(int j=i;j<s.length();j++)
            {
                ss+=s.charAt(j);
                arr.add(ss);
            }
        }
    }
    public int longestPalindrome(String s, String t) {
        List<String>s1=new ArrayList<>();
        List<String>t1=new ArrayList<>();
        findsubstring(s,s1);
        findsubstring(t,t1);
        // System.out.println(s1);
        // System.out.println(t1);
        int m=0;
        if(isPailn(s))
        {
            m=Math.max(m,s.length());
        }
        if(isPailn(t))
        {
            m=Math.max(m,t.length());
        }
        for(int i=0;i<s1.size();i++)
        {
            for(int j=0;j<t1.size();j++)
            {
                String sb=s1.get(i)+t1.get(j);
                if(isPailn(sb))
                {
                    m=Math.max(m,sb.length());
                }
            }
        }
       
           for(int i=0;i<s1.size();i++)
           {
                String x=s1.get(i);
                System.out.println(x);
                if(isPailn(x))
                {
                    m=Math.max(m,x.length());
                }
            }
            for(String x:t1)
            {
                if(isPailn(x))
                {
                    m=Math.max(m,x.length());
                }
            }
        
        return m;

    }
}