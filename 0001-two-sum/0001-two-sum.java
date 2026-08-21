class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if((temp + nums[j])==target){
                    int[] arr=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }

        }
        return new int[]{-1,-1};
    }
}