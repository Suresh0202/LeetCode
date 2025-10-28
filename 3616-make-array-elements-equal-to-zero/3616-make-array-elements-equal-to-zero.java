class Solution {
    public int countValidSelections(int[] nums) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt+=canMake(nums, i);
            }
        }
        return cnt;
    }
    static int canMake(int nums[], int ind){
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=nums[i];
        }
        int idx=ind;
        boolean left=true;
        int ans=0;
        while(idx>=0 && idx<nums.length){
            if(arr[idx]==0){
                if(left){
                    idx--;
                }
                else idx++;
            }
            else if(arr[idx]>0){
                arr[idx]--;
                if(left){
                    left=false;
                    idx++;
                }
                else{
                    left=true;
                    idx--;
                }
            }
        }
        int not=0;
        for(int i:arr){
            if(i!=0){
                not=1;
                break;
            }
        }
        if(not==0) ans++;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        idx=ind;
        boolean right=true;

        while(idx>=0 && idx<nums.length){
            if(arr[idx]==0){
                if(right){
                    idx++;
                }
                else idx--;
            }
            else if(arr[idx]>0){
                arr[idx]--;
                if(right){
                    right=false;
                    idx--;
                }
                else{
                    right=true;
                    idx++;
                }
            }
        }
        not=0;
        for(int i:arr){
            if(i!=0){
                not=1;
                break;
            }
        }
        if(not==0) ans++;
        return ans;
    }
}