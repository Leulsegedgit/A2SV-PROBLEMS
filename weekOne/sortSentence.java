class Solution {
    public String sortSentence(String s) {
       String[] words = s.split(" ");
        List<String> a = new ArrayList<String>();
      for (int i = 0; i < words.length; i++) {
          a.add(words[i]);
      }
    for (int i = 0; i < a.size(); i++) {
    
    for (int j = 0; j < (a.size() - 1); j++) {
        // Swap adjacent elements if they are in decreasing order
        if (Integer.parseInt(a.get(j).substring(a.get(j).length()-1)) > Integer.parseInt(a.get(j+1).substring(a.get(j+1).length()-1))) {
            Collections.swap(a,j,j+1);
            
        }
    }
        
    }
    String sorted_sentence ="";
    for (int i = 0; i < a.size(); i++) {
          sorted_sentence += a.get(i).substring(0,a.get(i).length()-1);
         if(i!=a.size()-1)
              sorted_sentence+=" ";
      }
return sorted_sentence;
}
}
