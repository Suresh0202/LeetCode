class Solution {
    public String longestPrefix(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            String suf = s.substring(0, i);
            if (s.endsWith(suf)) {
                return suf;
            }
        }
        return "";
    }
}