class Solution {
    public int missingNumber(int[] nums) {
        int number = 0;
        for(int num:nums){
            number^=num;
        }

        for(int i = 0; i<=nums.length;i++){
            number^=i;
        }
        return number;
    }
}
