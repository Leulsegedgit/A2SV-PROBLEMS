class Solution {
    public void sortColors(int[] nums) {
         List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
          a.add(nums[i]);
      }
        for (int i = 0; i < a.size(); i++) {
    
    for (int j = 0; j < (a.size() - 1); j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a.get(j) >= a.get(j+1)) {
            Collections.swap(a,j,j+1);
            }
    }
    }
        for (int i = 0; i < nums.length; i++) {
          nums[i]=a.get(i);
      }
    }
}
