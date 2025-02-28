class Solution {
    boolean func(StringBuilder sb,char ch2[])
    {
        char ch1[]=sb.toString().toCharArray();
       
        Arrays.sort(ch1);
        // Sys/tem.out.println(Arrays.toString(ch1));
        // System.out.println(Arrays.toString(ch2));
        if(Arrays.equals(ch1,ch2))
        {
            return true;
        }
        return false;
    }
    public boolean checkInclusion(String s1, String s2) {
        List<String>ar=new ArrayList<>();
        int r=0,l=0;
        int n=s2.length();
         char ch2[]=s1.toCharArray();
         Arrays.sort(ch2);
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