class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        HashMap <Character , Integer > map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i) ,map.getOrDefault(stones.charAt(i),0)+1);
        }
        int sum =0;

        for(char ch : jewels.toCharArray()){
            sum += map.getOrDefault(ch,0);
        }
        return sum;
    }
}