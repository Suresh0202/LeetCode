class Solution {
public:
    int partitionArray(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int ans=0;
        int min=nums[0];
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]-min > k)
            {
                ans++;
                min=nums[i];
            }
        }
        return ans+1;
    }
};