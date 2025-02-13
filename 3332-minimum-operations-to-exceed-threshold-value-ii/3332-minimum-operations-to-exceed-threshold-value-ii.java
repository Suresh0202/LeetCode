class Solution {
    public static boolean func(PriorityQueue<Integer> p, int k) {
        for (Integer i : p) {
            if (i < k) {
                return false;
            }
        }
        return true;
    }
    public static boolean func1(int nums[],int k)
    {
        for(int i:nums)
        {
            if(i<k)
            {
                return false;
            }
        }
        return true;
    }
    public int minOperations(int[] nums, int k) {
        if(func1(nums,k))
        {
            return 0;
        }
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i : nums) {
            p.add(i);
        }
        int c = 1;
        System.out.println(p);
        while (true) {
            if (p.size() >= 2) {
                Integer x = p.peek();
                p.remove(x);
                Integer y = p.peek();
                p.remove(y);
                if (y < k && x * 2 < k && x * 2 + y < k) // prevent int overflow
                    p.add(x * 2 + y);
                else
                    p.add(k);
                // System.out.println(p +" "+ x+" "+ y+" "+ ans+"before ");

            }
            // System.out.println(p +" "+ x+" "+ y+" "+ ans+" ");
            if (!func(p, k)) {
                c++;
            } else {
                break;
            }
        }
        // System.out.println(p);
        return c;
    }
}