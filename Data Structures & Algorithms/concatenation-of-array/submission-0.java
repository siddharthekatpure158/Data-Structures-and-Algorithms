class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        int i;
        for(i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int k=0;
        for(int j=i;j<ans.length;j++){
            ans[j]=nums[k];
            k++;
        }
        return ans;
    }
}