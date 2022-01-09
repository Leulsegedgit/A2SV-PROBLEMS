 public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    int[] frq_arr = new int[100];
    for(int i=0; i<arr.size(); i++){
       frq_arr[arr.get(i)] =  frq_arr[arr.get(i)]+1;
   }
    List<Integer> frequency_array = new ArrayList<Integer>();
   for(int i=0; i<100; i++){
        
        frequency_array.add(i,frq_arr[i]);
    }
    
    return frequency_array; 
    }

}
