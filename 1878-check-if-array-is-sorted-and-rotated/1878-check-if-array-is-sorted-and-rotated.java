class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int rotations = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                rotations++;
            }
        }

        // If the array is already sorted or can be sorted by at most one rotation
        if (rotations <= 1) {
            // Check if we need to rotate from the last element to the first element
            if (rotations == 1 && arr[n - 1] > arr[0]) {
                return false;
            }
            return true;
        }

        // If more than one rotation is required, the array cannot be sorted
        return false;
    }
}