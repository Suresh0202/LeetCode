public class Solution {
    public int reverseBits(int n) {
        String s=Integer.toBinaryString(n);
        // int x=Integet.toBinaryString
        char ch[]=new char[32];
        System.out.println(s +" " +s.length());
        if(s.length()!=32)
        {
            int x=32-s.length();
            int i=0;
            while(x-->0)
            {
                ch[i++]='0';
            }
            int j=0;
            for(int p=i;p<32;p++)
            {
                ch[p]=s.charAt(j++);
            }
        }else
        {
            ch=s.toCharArray();
        }
        System.out.println(Arrays.toString(ch));
        int ans=0;
        for(int i=0;i<32;i++)
        {
       
            if(ch[i]=='1')
            {
                ans+=(1<<i);
            }
        }
        // if(ch[0]=='1')
        // {
        //     return -1*ans;
        // }
        return ans;
    }
}