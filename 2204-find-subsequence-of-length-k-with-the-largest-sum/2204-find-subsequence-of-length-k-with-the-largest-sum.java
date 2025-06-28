import java.util.*;

class Pair {
    int idx;
    int val;

    Pair(int idx, int val) {
        this.idx = idx;
        this.val = val;
    }
}

class Pair1 {
    int idx1;
    int val1;

    Pair1(int idx1, int val1) {
        this.idx1 = idx1;
        this.val1 = val1;
    }
}

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.val != b.val) {
                return a.val - b.val;
            }
            return a.idx - b.idx;
        });

        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair(i, nums[i]));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[] ans = new int[k];
        ArrayList<Pair1> arr = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            arr.add(new Pair1(p.idx, p.val));
        }

        arr.sort((a, b) -> a.idx1 - b.idx1);

        for (int i = 0; i < k; i++) {
            ans[i] = arr.get(i).val1;
        }

        return ans;
    }
}
