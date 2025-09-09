class Solution {
    public String compressedString(String word) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<word.length())
        {
            int c=0;
            char ch=word.charAt(i);
            while(i<word.length() && c<9 && ch == word.charAt(i))
            {
                i++;
                c++;

            }
            sb.append(c).append(ch);
        }
        return sb.toString();
    }
}