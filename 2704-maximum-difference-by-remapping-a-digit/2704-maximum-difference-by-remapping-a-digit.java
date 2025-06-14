class Solution {
    public int minMaxDifference(int num) {
            char ch[]=(""+num).toCharArray(); 
            char ch1[]=(""+num).toCharArray(); 
            char x='a';
            char y='a';
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]!='9')
                {
                    x=ch[i];
                    break;
                }
            }
            if(x != 'a')
            {
                for(int i=0;i<ch.length;i++)
                {
                        if(ch[i] == x)
                        {
                            ch[i]='9';
                        } 
                }
            }
           String bs="";
           for(int i=0;i<ch.length;i++)
           {
            bs+=ch[i];
           }

           int big=Integer.parseInt(bs);
            for(int i=0;i<ch1.length;i++)
            {
                if(ch1[i]!='0')
                {
                    y=ch1[i];
                    break;
                }
            }
            if(y != 'a')
            {
                for(int i=0;i<ch1.length;i++)
                {
                        if(ch1[i] == y)
                        {
                            ch1[i]='0';
                        } 
                }
            }
           String bs1="";
           for(int i=0;i<ch.length;i++)
           {
            bs1+=ch1[i];
           }
           int smq=Integer.parseInt(bs1);
        //    System.out.println(bs1+"  "+bs);
           return big-smq;
           
    }
}