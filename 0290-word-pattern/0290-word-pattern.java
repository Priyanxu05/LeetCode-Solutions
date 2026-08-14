class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap< Character , String > map1=new HashMap<>();
        HashMap< String , Character > map2=new HashMap<>();
        String[] words=s.split(" ");

        if(pattern.length()!=words.length) {
            return false;
        }

        for(int i=0 ;i< pattern.length() ;i++){
            char a=pattern.charAt(i);
            String b=words[i];

            if(map1.containsKey(a)){
                if(!map1.get(a).equals(b)){
                    return false;
                }
            }
            else{
                map1.put(a,b);
            }
            if(map2.containsKey(b)){
                if(map2.get(b) != (a)){
                    return false;
                }
            }
            else{
                map2.put(b,a);
            }
        }
        return true;
    }
}