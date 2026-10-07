class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        int pre = 1;
        for(int i =0; i<n;i++){
            prefix[i] = pre;
            pre*=nums[i];
        }

        int[] suffix = new int[n];
        int suf = 1;
        for(int i = n-1;i>=0;i--){
            suffix[i] = suf;
            suf*=nums[i];
        }

        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}  
