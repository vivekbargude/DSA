import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
class Tester {

	public static void main(String args[]) {
		Map<String, Double> studentMarks = new HashMap<String, Double>();
	    studentMarks.put("Lily", 90.0);
		studentMarks.put("Robin", 68.0);
		studentMarks.put("Marshall", 76.5);
		studentMarks.put("Neil", 67.0);
		studentMarks.put("Ted", 92.0);
		
		Map<String, Double> maxMinScorers = Student.findMaxMinScorers(studentMarks);
		
		System.out.println("Details of Top Scorers & Low Scorers\n====================================");
		for (Entry<String, Double> entry : maxMinScorers.entrySet()) {
			System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}

class Student {
	
    public static Map<String, Double> findMaxMinScorers(Map<String, Double> studentMarks) {
        
        Map<String,Double> ans = new HashMap<String,Double>();
        Double minscore = Double.MAX_VALUE;
        Double maxscore = Double.MIN_VALUE;
        String minscorer = null;
        String maxscorer = null;
        
        for(Entry<String, Double> entry : studentMarks.entrySet()){
            String name=entry.getKey();
            Double marks=entry.getValue();
            
            if(marks>maxscore){
                maxscore=marks;
                maxscorer=name;
            }
            
            if(marks<minscore){
                minscore=marks;
                minscorer=name;
            }
        }
        
        ans.put(maxscorer,maxscore);
        ans.put(minscorer,minscore);
        
        return ans;
		
	}

}

