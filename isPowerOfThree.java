class Solution {
    public boolean isPowerOfThree(int n) {
        double x = Math.log10(n)/Math.log10(3);
        if(Math.floor(x)==x&&n!=0)
            return true;
        else
            return false;
    }
}
