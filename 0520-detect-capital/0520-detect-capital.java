class Solution {
    public boolean isCapital(char ch)
    {
        if(ch >= 'A' && ch <= 'Z')
        {
            return true;
        }
        return false;
    }
    public boolean isSmall(char ch)
    {
        if(ch >='a' && ch <= 'z')
        {
            return true;
        }
        return false;
    }
    public boolean func1(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(!(isCapital(ch))){
                return false;
            }   
        }
        return true;
    }
     public boolean func2(String word)
    {
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(!(isSmall(ch))){
                return false;
            }   
        }
        return true;
    }
     public boolean func3(String word)
    {
        for(int i=1;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(!(isSmall(ch))){
                return false;
            }   
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        return func1(word) || func2(word) || func3(word);
    }
}