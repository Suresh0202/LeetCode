class Solution {
    public void func(int arr[],int k,int idx,int n, List<List<Integer>>ans,List<Integer>a)
    {
        if(idx == n)
        {
            if(k == 0)
            {
                ans.add(new ArrayList<>(a));
            }
            return;
        }
        if(arr[idx]<=k)
        {
            a.add(arr[idx]);
            func(arr,k-arr[idx],idx,n,ans,a);
            a.remove(a.size()-1);
        }
        func(arr,k,idx+1,n,ans,a);

    }
    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>a=new ArrayList<>();
        func(arr,tar,0,arr.length,ans,a);
        return ans;
    }
}