class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int count =0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        while(count<n){
            arr[count] = 0;
            count++;
        }
    }
}