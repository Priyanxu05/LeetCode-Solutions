class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int x : nums2){
            if(map.getOrDefault(x,0)>0){
                list.add(x);

                map.put(x,map.get(x)-1);
            }
        }

        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }

        return arr;
    }
}