import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
	    Deque<Integer> ans = new ArrayDeque<Integer>();
	    int smallest = Integer.MAX_VALUE;
	    int count = 0;
	    for(Integer value : inputStack){
	        if(value<smallest){
	            smallest=value;
	            count=1;
	        }else if(value==smallest){
	            count+=1;
	        }
	    }
	    
	    while(!inputStack.isEmpty()){
	        int val = inputStack.pop();
	        if(val != smallest){
	            ans.push(val);
	        }
	    }
	    
	    for(int j=0;j<count;j++){
	        ans.push(smallest);
	    }
	    
	    while(!ans.isEmpty()){
	        inputStack.push(ans.pop());
	    }
	    
		return inputStack;
	}

	public static void main(String[] args) {
		
		Deque<Integer> inputStack = new ArrayDeque<Integer>();
		inputStack.push(10);
		inputStack.push(8);
		inputStack.push(5);
		inputStack.push(12);
		inputStack.push(5);
	
		Deque<Integer> updatedStack = changeSmallest(inputStack);
		
		System.out.println("Stack After Modification:");
		for (Integer value : updatedStack)
			System.out.println(value);
	}
}
