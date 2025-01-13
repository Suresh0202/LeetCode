class Solution {
     public static boolean funcLeft(char c,char []ch,int i)
    {
        int flag=0;
        for(int j=i-1;j>=0;j--)
        {
            if(ch[j]==c)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        return false;
    }
    public static boolean funcRight(char c,char []ch,int i)
    {
        int flag=0;
        for(int j=i+1;j<ch.length;j++)
        {
            if(ch[j]==c)
            {
                // System.out.println(c);
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            return true;
        }
        return false;
    }
     public static int funcLeft1(char c,char []ch,int i)
    {
        int flag=0;
        for(int j=i-1;j>=0;j--)
        {
            if(ch[j]==c)
            {
                flag=j;
                break;
            }
        }
        return flag;
    }
    public static int funcRight1(char c,char []ch,int i)
    {
        int flag=0;
        for(int j=i+1;j<ch.length;j++)
        {
            if(ch[j]==c)
            {
                // System.out.println(c);
                flag=j;
                break;
            }
        }
        
        return flag;
    }
    public int minimumLength(String s) {
        char ch[]=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
            char c=ch[i];
            if(funcLeft(c,ch,i) && funcRight(c,ch,i))
            {
                    int a=funcRight1(c,ch,i);
	                 int b=funcLeft1(c,ch,i);
	                ch[a]=' ';
	                ch[b]=' ';
            }
            
        }
        int cnt=0;
        for(char chh:ch)
        {

            if(chh==' ')
            {
                // cnt++;
            }else
            {
                cnt++;
            }
        }
        return cnt;
    }
}