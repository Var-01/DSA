class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int count=0;
        for(int i=1; i<n; i++){
            if(arr[count] != arr[i]){
                count++;
                arr[count] = arr[i];
            }
        }
        return count+1;
    }
}