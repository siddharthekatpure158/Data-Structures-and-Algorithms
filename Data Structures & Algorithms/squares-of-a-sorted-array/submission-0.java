class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int arr[]=new int[nums.length];
        while(i<=j){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
                arr[k--]=nums[j]*nums[j--];
            }
            else{
                arr[k--]=nums[i]*nums[i++];
            }
        }
        return arr;
    }
}