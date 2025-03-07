class Solution {
    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int[] closestPrimes(int left, int right) {
        List<Integer> ar = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                ar.add(i);
            }
        }
        System.out.println(ar);
        int ans[] = new int[2];
        int m = Integer.MAX_VALUE;
        ans[0]=-1;
        ans[1]=-1;
        for (int i = 1; i < ar.size(); i++) {
            int x = ar.get(i);
            int y = ar.get(i - 1);
            int d = x - y;
            if (d < m) {
                m = d;
                // ans1=Math.min(ans1,x);
                // ans2=Math.min(ans2,y);
                ans[0] = y;
                ans[1] = x;
            }

        }

        if (ans[0] == -1 && ans[1] == -1) {
            return new int[] { -1, -1 };
        }
        return ans;
    }
}