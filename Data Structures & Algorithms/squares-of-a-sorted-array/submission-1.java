class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] arr=new int[nums.length];
        while(k>=0){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                arr[k--]=(Math.abs(nums[j])*Math.abs(nums[j--]));
            }
            else{
                arr[k--]=(Math.abs(nums[i])*Math.abs(nums[i++]));
            }
        }
        return arr;
        
    }
}