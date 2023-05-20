class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n-1;

        
        while(l<=r){
            int mid = (l+r)/2;

            if(arr[mid] > arr[r]){
                l = mid+1;
            }
            else if(arr[mid] < arr[r]){
                r = mid;
            }
            else
                return arr[r];
        }
        return arr[r];
    }
}