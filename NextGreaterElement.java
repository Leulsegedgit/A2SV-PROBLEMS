class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> g = new ArrayList<Integer>();
        boolean start_check = false;
        boolean found = false;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]==nums2[j])
                    start_check = true;
                else if(!start_check) continue;
                
            if(nums2[j]>nums1[i])
            {
                g.add(nums2[j]);
                found = true;
                break;
}
                
                
}
            if(!found)
                g.add(-1);
            
            start_check = false;
            found =false;
}
        int[] ga = new int[g.size()];
        for(int i = 0; i < g.size(); i++) ga[i] = g.get(i);
     return ga;
    }
}
