class Solution {
    public String frequencySort(String s) {
        HashMap < Character , Integer > map = new HashMap<>();

        for(int i=0;i < s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch , 0)+1);
        }
        List < Map.Entry<Character , Integer >> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        StringBuilder sb =new StringBuilder();

        for(Map.Entry <Character ,Integer > x : list ){
            char ch = x.getKey();
            int n=x.getValue();

            for(int i=0 ; i < n ;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}