class Solution {
    public int preimageSizeFZF(int k) {
        long l=0;
        long r=5L * (k +1);

        while(l<= r){
            long mid=l + (r-l)/2;
            long n=countzeros(mid);
            if(n == k)return 5;
            else if (n > k)r=mid-1;
            else l=mid+1;
        }
        return 0;
    }

    public long countzeros(long x){
        long count=0;
        while( x > 0){
            x/=5;
            count+=x;
        }
        return count;
    }
}