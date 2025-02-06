class Solution {
    public boolean isPalindrome(int x) {
     if(x<0) {
        return false;
     }
     int n = x;

     int revNum = 0;

     while(n>0) {
        int digit = n%10;
        revNum = revNum*10 + digit;
        n = n/10;
     }
     if(x == revNum) {
        return true;
     } else {
        return false;
     }
    }
}