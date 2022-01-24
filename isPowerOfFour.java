class Solution {
    public boolean isPowerOfFour(int n) {
        double x = Math.log10(n)/Math.log10(4);
        if(Math.floor(x)==x&&n!=0)
            return true;
        else
            return false;
    }
}
