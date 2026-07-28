class Solution {
    public boolean isPalindrome(int x) {
        int rem=0,or=x;
        long rev=0;
        if(x<0)
        {
            return false;
        }
        while(x>0){
        rem=x%10;
        rev=rem+(rev*10);
        x=x/10;
    }
    if(or==rev)
    {
        return true;
    }
    else
    {
        return false;
    }
    }
}