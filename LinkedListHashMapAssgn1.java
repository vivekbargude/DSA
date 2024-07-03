import java.util.LinkedList;
import java.util.List;

class Tester {

	public static List<Integer> removeDuplicates(List<Integer> list) {
       List<Integer> ans = new LinkedList<Integer>();
       
       for(Integer val : list){
           if(!ans.contains(val)){
               ans.add(val);
           }
       }
       
        return ans;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	
}
