class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int selected = 10000;
        int index = 0;
        for(int j=i; j<arr.length; j++){
            if(arr[j]<selected){
                selected = arr[j];
                index = j;
            }
        }
        return index;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    //int[] sorted = new int[n];
	    for(int i=0; i<n; i++){
	        int temp = arr[i];
	        int selected = select(arr,i);
	        arr[i]=arr[selected];
	        arr[selected]=temp;
	        
	    }
	}
}
