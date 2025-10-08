class Solution {
    public String reverseVowels(String s) {
        String vowels = "";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowels = vowels + ch;
            }
        }
        int length = 0;
        length = vowels.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                result = result + vowels.charAt(length);
                length = length - 1;
            } else {
                result = result + ch;
            }
        }
        return result;
    }
}