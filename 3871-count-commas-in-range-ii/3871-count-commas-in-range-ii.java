class Solution {
    public long countCommas(long n) {
        long ans=0;
        long st=1000;
        int cms=1;
        while(st<=n){
            long end=st*1000-1;
            long cnt=Math.min(n,end)-st+1;
            ans+=cnt*cms;
            st*=1000;
            cms++;
        }

        return ans;
        
    }
}