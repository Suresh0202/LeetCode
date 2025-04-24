class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int>mp;
        int arr[2];
        arr[0]=-1;
        arr[1]=-1;
        for(int i=0;i<nums.size();i++)
        {
            int x=target-nums[i];
            if(mp.find(x) != mp.end())
            {
                arr[0]=mp[x];
                arr[1]=i;
                break;
            }
            mp[nums[i]]=i;
        }
        return vector<int>{arr[0],arr[1]};
    }
};