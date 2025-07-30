class Solution {
    public void qs(int nums[],int low,int high)
    {
        if(low<high)
        {
            int part=find(nums,low,high);
            qs(nums,low,part-1);
            qs(nums,part+1,high);
        }
    }
    public int find(int nums[],int low,int high)
    {
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j)
        {
            while(nums[i]<=pivot && i<high)
            {
                i++;
            }
            while(nums[j]>pivot && j>low)
            {
                j--;
            }
            if(i<j)
            {
                int tp=nums[j];
                nums[j]=nums[i];
                nums[i]=tp;
            }
        }
        int tp=nums[j];
        nums[j]=nums[low];
        nums[low]=tp;
        return j;

    }
    public void sortColors(int[] nums) {
        qs(nums,0,nums.length-1);
    }
}