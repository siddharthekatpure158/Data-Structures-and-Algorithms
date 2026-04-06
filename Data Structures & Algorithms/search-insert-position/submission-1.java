class Solution {
    public int searchInsert(int[] nums, int target) {

        int start=0;
        int end=nums.length-1;
        int answer=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]>target){
                answer=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(answer>0){
            return answer;
        }
        else{
            return start;
        }
        
    }
}