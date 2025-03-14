class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, el = 0,c1=0;
        for (int i = 0; i < nums.length; i++) {
            if (c == 0) {
                c = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                c++;
            } else {
                c--;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el) {
                c1++;
            }
        }
        if (c1 > (nums.length) / 2) {
            return el;
        }
        return -1;
    }
}