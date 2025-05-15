import java.util.*;

class Solution {
    Map<String, List<String>> memo = new HashMap<>();

    public List<String> dp(String[] words, int[] groups, int idx, int prevGroup) {
        if (idx == words.length) return new ArrayList<>();

        String key = idx + "," + prevGroup;
        if (memo.containsKey(key)) return memo.get(key);

        // Skip current word
        List<String> skip = dp(words, groups, idx + 1, prevGroup);

        List<String> take = new ArrayList<>();
        if (groups[idx] != prevGroup) {
            take.add(words[idx]);
            take.addAll(dp(words, groups, idx + 1, groups[idx]));
        }

        // Choose longer list between take and skip
        List<String> result = (take.size() > skip.size()) ? take : skip;
        memo.put(key, result);
        return result;
    }

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        memo.clear();
        return dp(words, groups, 0, -1);
    }
}
