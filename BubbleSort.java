 public static void countSwaps(List<Integer> a) {
    // Write your code here
    int num_of_swaps = 0;
    for (int i = 0; i < a.size(); i++) {
    
    for (int j = 0; j < (a.size() - 1); j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a.get(j) > a.get(j+1)) {
            Collections.swap(a,j,j+1);
            num_of_swaps++;
        }
    }
    
}
System.out.println("Array is sorted in "+num_of_swaps+" swaps.");
System.out.println("First Element: "+a.get(0));
System.out.println("Last Element: "+a.get(a.size()-1));
    }
