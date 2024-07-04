class Tester {
    
    public static int iterations=0;
	
	public static int searchElement(int elements[],int low,int high,int elementToBeSearched)  {
		
		int count=0;
		while(low<=high){
		    int mid = low + high /2;
		    if (elements[mid]==elementToBeSearched){
		        ++count;
		        return count;
		    }
		    if(elements[mid]<elementToBeSearched){
		        low=mid+1;
		        ++count;
		    }
		    else{
		        high=mid-1;
		        ++count;
		    }
		    
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
	    int[] elements = { 1, 23, 43, 46, 78, 90 };
		int elementToBeSearched = 43;
		
		int indexPosition=searchElement(elements, 0, elements.length-1, elementToBeSearched);
		
		if (indexPosition == -1)
			System.out.println("Element not found!");
		else
			System.out.println("Element found at index position " + indexPosition+"!");
		
		System.out.println("Number of iterations: "+iterations);
	}

	
}
