class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min=Integer.MAX_VALUE;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]-arr[i-1]);
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[i-1] == min){
                List<Integer> ar=new ArrayList<>();
                ar.add(arr[i-1]);
                ar.add(arr[i]);
                ans.add(ar);
            }
            
            
        }
        return ans;
    }
}