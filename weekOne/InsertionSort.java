import java.util.ArrayList;
import java.util.List;

public class InsertionSort{
    public static void main(String[] args){
        List<Integer> unsorted = new ArrayList<Integer>();
        unsorted.add(2);
        unsorted.add(4);
        unsorted.add(6);
        unsorted.add(8);
        unsorted.add(3);
        insertionSort1(5,unsorted);
    }
    public static void insertionSort1(int n, List<Integer> arr) 
    {
        // Write your code here
        int e = arr.get(arr.size()-1);
        for(int i=arr.size()-2; i>=0; i--){
            
            if(arr.get(i)>e)
                arr.set(i+1,arr.get(i));  
            else 
            {
                 arr.set(i+1,e);
                 printAtFail(arr);
                 break;
            }
                
            printAtFail(arr);
            
            System.out.println();
            
        }
        
        if(arr.get(0)>e)
         {
            arr.set(0,e);
            printAtFail(arr);
         }
     }


        static void printAtFail(List<Integer> arr){
            for(int i=0; i<arr.size(); i++){
                
                   System.out.print(arr.get(i)+" "); 
                
            }
        }
}