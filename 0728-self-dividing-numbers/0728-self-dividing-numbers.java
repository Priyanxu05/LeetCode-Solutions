class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer > arr= new ArrayList<>();

        for(int i=left;i<=right;i++){
            int temp=i;
            boolean v=true;

            while(temp>0){
                int dig= temp %10;

                if(dig == 0 || i % dig !=0){
                    v=false;
                    break;
                }
                temp=temp/10;

            }
            if(v== true){
                arr.add(i);
            }
        }
        return arr;

    }
}