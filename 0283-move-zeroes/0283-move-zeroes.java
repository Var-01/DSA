class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int left =0;
        int right = 0;

        while(right < n){
            if(arr[right] == 0){
                right++;
            }
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right++;
            }
        }
    }
}