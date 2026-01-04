class Solution {
    public static boolean isPerfect(int n) {
        int x=(int)Math.sqrt(n);
        return (x*x) == n;
    }

    public static boolean isHaving(int n) {
        int cnt = 0;
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    cnt += 1;   // perfect square divisor counted once
                } else {
                    cnt += 2;
                }
            }
        }
        // return cnt == 4;
        return cnt == 4;
    }

    public int find(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        return sum;
    }

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (isHaving(nums[i])) {
                a.add(nums[i]);
            }
            //    sum+=x;
        }
        for (int i = 0; i < a.size(); i++) {
            sum += find(a.get(i));
        }
        System.out.println(a);
        return sum;
    }

}