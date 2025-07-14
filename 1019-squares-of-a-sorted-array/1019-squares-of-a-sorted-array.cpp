class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int>ans;
        int n=nums.size();
        cout<<n;
        int i=0;
        int j=n-1;
        int k=n-1;
        while(i<=j && k>=0)
        {
            if(abs(nums[i]) < abs(nums[j]))
            {
                int p=abs(nums[j]);
                ans.insert(ans.begin(),p*p);
                k--;
                j--;
            }else
            {
                int p=abs(nums[i]);
                ans.insert(ans.begin(),p*p);
                k--;
                i++;
            }
        }
        return ans;
    }
};