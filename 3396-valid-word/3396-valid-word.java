class Solution {
    public boolean isVowel(char ch)
    {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' || ch=='A' ||ch=='E' || ch == 'I' || ch =='O' || ch == 'U';
    }
    public boolean isCons(char ch)
    {
         return Character.isLetter(ch) && !(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||  ch=='u' || ch=='A' ||ch=='E' || ch == 'I' || ch =='O' || ch == 'U');
    }
  
    public boolean isValid(String word) {
        int ch=0;
        int cons=0;
        int vowel=0;
        int dig=0;
        int spe=0;
        int val=0;
        for(int i=0;i<word.length();i++)
        {
            if(isVowel(word.charAt(i)))
            {
                vowel++;
            }else if(isCons(word.charAt(i)))
            {
                cons++;
            }else if(Character.isDigit(word.charAt(i)))
            {

                dig++;
            }else if(word.charAt(i) =='&' || word.charAt(i) =='@' || word.charAt(i) =='#' )
            {
                    spe++;
            }
        }
        if(word.length() <3)return false;
        System.out.println(spe);
        if(spe >=1)
        {
            return false;
        }
        return (vowel>=1 && cons>=1);
    }
}