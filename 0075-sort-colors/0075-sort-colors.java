class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int mid=0;
        int r=nums.length -1 ;
        int temp;
        while(mid <= r){
            if(nums[mid]== 0){
             temp=nums[mid];
             nums[mid]=nums[l];
             nums[l]=temp;
             l++;
             mid++;
            }
           else if(nums[mid]== 1){
             mid++;
            }
            else{
            temp=nums[mid];
             nums[mid]=nums[r];
             nums[r]=temp;
             r--;
            }
        }
    }
}