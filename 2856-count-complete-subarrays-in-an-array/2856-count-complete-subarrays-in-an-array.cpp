class Solution {
public:
    int countCompleteSubarrays(vector<int>& nums) {
        set<int>st;
        for(auto it:nums){
            st.insert(it);
        }
        int cnt=0;
        int n=nums.size();
        for(int i=0;i<n;i++)
        {
            set<int>st1;
            for(int j=i;j<n;j++)
            {
                st1.insert(nums[j]);
                if(st.size()  == st1.size())
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
};