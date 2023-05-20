class Solution {
    public boolean search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] > arr[low]){
                if(target >= arr[low] && target < arr[mid])
                    high = mid;
                else
                    low = mid+1;
            }
            else if(arr[mid] < arr[low]){
                if(target > arr[mid] && target < arr[low])
                    low = mid+1;
                else 
                    high = mid;
            }
            else{
                low++;
            }
        }
        return false;
    }
}