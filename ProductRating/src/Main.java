import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		List<List<Integer>> ProductRatings = new ArrayList<List<Integer>>();
		
		List<Integer> entry = new ArrayList<Integer>();
		entry.add(1);
		entry.add(4);
		
		List<Integer> entry2 = new ArrayList<Integer>();
		entry2.add(4);
		entry2.add(4);
		
		List<Integer> entry3 = new ArrayList<Integer>();
		entry3.add(3);
		entry3.add(4);
		
		ProductRatings.add(entry);
		ProductRatings.add(entry2);
		ProductRatings.add(entry3);
		
		System.out.println(ProductRatings);
		
		System.out.println(s.findMinSteps(ProductRatings, 70));
	}

}
