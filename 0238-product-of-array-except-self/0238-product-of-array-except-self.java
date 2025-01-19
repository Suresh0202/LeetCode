class Solution {
    public int[] productExceptSelf(int[] arr) {
        long pro = 1;
        int cnt = 0;
        int ans = -1;
        int n=arr.length;
        int ansar[]=new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
                ans = i;

            } else {
                pro *= arr[i];
            }
        }
        if (cnt == 1) {
            for (int i = 0; i < n; i++) {
                if (i == ans) {
                    // System.out.print(pro + " ");
                    ansar[i]=(int)pro;
                } else {
                    // System.out.print(0 + " ");
                    ansar[i]=0;
                }
            }
        } else if (cnt >= 2) {
            for (int i = 0; i < n; i++) {
                // System.out.print(0 + " ");
                ansar[i]=0;
            }
        } else {
            for (int i = 0; i < n; i++) {
                // System.out.print(((int) pro / arr[i])
                        // % (int) (1e9 + 7) + " ");
                        ansar[i]=((int)pro/arr[i]);
            }
        }
        return ansar;
    }
}