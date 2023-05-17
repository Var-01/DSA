class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(even(nums[i]))
                count++;
        }
        return count;
    }
    static boolean even(int n){
        if(digits(n)%2 ==0)
            return true;
        return false;
    }

    static int digits(int n){
        int count =0;
        while(n >0){
            count++;
            n = n/10;
        }
        return count;
    }

}