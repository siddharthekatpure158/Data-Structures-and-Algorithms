class Solution {
    public int mySqrt(int x) {
        long start=0;
        long end=x;
        long answer=0;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid==x) return (int)mid;
            else if(mid*mid>x) end=mid-1;
            else {
                answer=mid;
                start=mid+1;
            }
        }
        return (int)answer;
    }
}