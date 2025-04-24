class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
      
        vector<int>arr(2,-1);
        // arr[0]=-1;
        // arr[1]=-1;
        for(int i=0;i<nums.size();i++)
        {
            int f=0;
            for(int j=0;j<nums.size();j++)
            {
                if(i!=j)
                {
                if(nums[i] +  nums[j] == target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    f=1;
                    break;
                }
                }
            }
            if(f == 1)break;
        }
      return arr;
    }
};