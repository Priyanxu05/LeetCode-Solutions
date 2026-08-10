class Solution {
    int func(int arr[],int hour){
        int totalh=0;
        for(int i=0;i<arr.length;i++){
            totalh+=Math.ceil((double)arr[i]/(double)hour);
        }
        return totalh;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        max=Math.max(max,piles[i]);
        int l=1,reqtime,ans=0;
        while(l<=max){
            int m=l+(max-l)/2;
            reqtime=func(piles,m);
            if(reqtime<=h){
                ans=m;
            max=m-1;
            }
            else
            l=m+1;
        }return ans;
    }
}