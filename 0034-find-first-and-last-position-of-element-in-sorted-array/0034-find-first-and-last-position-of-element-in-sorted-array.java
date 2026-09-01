class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int a=0,b=nums.length-1;
        int f=-1,lt=-1;
        while(l<=r || a<=b){
            if(l<=r){
           int  mid=l+(r-l)/2;
            if(nums[mid]==target){
                f=mid;
                r=mid-1;
            }

            else if(target > nums[mid])l=mid+1;
            else r=mid-1;
        }
         if(a<=b){
            int mid=a+(b-a)/2;
            if(nums[mid]==target){
                lt=mid;
                a=mid+1;
            }

            else if(target > nums[mid])a=mid+1;
            else b=mid-1;
        }
        }

        return new int[]{f,lt};
    }
}