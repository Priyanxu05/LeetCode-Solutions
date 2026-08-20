class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int max=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;

        int[] freq=new int[26];
        for(int r=0;r<s.length();r++){
            freq[(s.charAt(r)-'A')]++;
            max=Math.max(max, freq[(s.charAt(r)-'A')]);

            while((r - l +1 ) - max > k ){
                freq[(s.charAt(l)-'A') ]--;
                l++;
            }

            ans=Math.max(ans, r - l +1 );
        }
        return  ans==Integer.MIN_VALUE ? 0 : ans;
    }
}