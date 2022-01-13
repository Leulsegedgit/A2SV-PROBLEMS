class RecentCounter {
    int counter;
    List<Integer> a = new ArrayList<Integer>();
    public RecentCounter() {
        counter = 0;
       
    }
    
    public int ping(int t) {
        counter = 0;
        a.add(t);
        int start_range = a.get(a.size()-1)-3000;
        
       for(int i=a.size()-1; i>=0; i--){
          if(a.get(i)>=start_range)
               counter++;
           else break;
        }
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
