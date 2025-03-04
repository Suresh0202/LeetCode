class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[]=new int[nums.length+1];
        Arrays.fill(arr,0);
        for(int i:nums)
        {
            if(i>=0 && i<=nums.length)
            {
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                return i;
            }
        }
        return arr.length;
    }
}