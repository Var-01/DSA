class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return -1; 
        }

        if (n == 1) {
            if (arr[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        for(int i=0; i<=n; i++){
            int flag = 0;
            for(int j=0; j<n; j++){
                if(arr[j] == i){
                    flag = 1;
                    break; 
                }
            }
            if(flag == 0){
                return i;
            }
        }
        return -1;
    }
}