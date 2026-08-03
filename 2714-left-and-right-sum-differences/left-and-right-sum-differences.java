class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int p=nums.length;

        int[] lsa = new int[p];
        int[] rsa = new int[p];

        lsa[0]=0;
        rsa[p-1]=0;

        for(int i=0; i<p-1; i++){
            lsa[i+1] = lsa[i]+nums[i];
        }

        for(int i=p-1; i>0; i--){
            rsa[i-1] = rsa[i]+nums[i];
        }

        for(int i=0;i<p; i++){
            nums[i]= Math.abs(lsa[i]-rsa[i]);
        }
        return nums;
    }
}