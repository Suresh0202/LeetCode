class Solution {
    long findCeil(int mid,int piles[]){
         long sum = 0;
        // float res = 0;
        for(int i = 0;i<piles.length;i++){
            // res = (float)Math.ceil(piles[i]/(float)mid);
            sum += (piles[i] + mid - 1L) / mid;
        }
        return sum;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int maxi = 0;
        for (int pile : piles) {
            maxi = Math.max(maxi, pile);
        }
        // int temp[] = new int[maxi];
        
        // for(int i = 1;i<=maxi;i++){
        //     temp[i-1] =  i;
        // }
        int low = 1;
        int high = maxi;
        //int ans = maxi;
        while(low<=high){
            int mid = (low+high)/2;
            long hrs = findCeil(mid,piles);
            if(hrs<=h){
               // ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}