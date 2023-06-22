class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k= k%n;
        rotate(arr, 0, n-k-1);
        rotate(arr, n-k, n-1);
        rotate(arr, 0, n-1);
    }
    static void rotate(int[] arr, int low, int high){
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}