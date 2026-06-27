
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long start=0;
        long end=n;
        while(start<=end){
            long mid=(start+end)/2;
            if(guess((int)mid)==0) return (int)mid;
            else if(guess((int)mid)<0) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}