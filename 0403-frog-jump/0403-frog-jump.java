class Solution {
    public boolean canCross(int[] stones) {
         int n = stones.length;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int stone : stones) {
            map.put(stone, new HashSet<>());
        }
        map.get(0).add(0);
        for (int stone : stones) {
            for (int step : map.get(stone)) {
                // Try k - 1, k, k + 1
                for (int jump = step - 1; jump <= step + 1; jump++) {
                    if (jump > 0 && map.containsKey(stone + jump)) {
                        map.get(stone + jump).add(jump);
                    }
                }
            }
        }
        return !map.get(stones[n - 1]).isEmpty();

    }
}