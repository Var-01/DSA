class Solution {
    public int missingNumber(int[] arr) {
        int N = arr.length;
        int sum = N*(N+1)/2;
        int ans  = 0;
        for(int i=0; i<N; i++){
                ans += arr[i];
        }
         return sum - ans;
    }
}