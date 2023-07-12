class Solution {
    public int longestConsecutive(int[] arr) {

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(int val: arr){
            hm.put(val, true);
        }

        for(int val: arr){
            if( hm.containsKey(val-1)){
                hm.put(val, false);
            }
        }
//        System.out.println(hm);

        int maxLength = 0;
        int maxStartPoint = 0;
        for(int val: arr){
            if(hm.get(val) == true){
                int tempLength = 1;
                int tempStart = val;

                while(hm.containsKey(tempStart + tempLength)){
                    tempLength++;
                }

                if(tempLength > maxLength){
                    maxLength = tempLength;
                    maxStartPoint = tempStart;
                }
            }
        }
        return maxLength;
    }
}