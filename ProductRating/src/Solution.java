import java.util.*;

public class Solution {

	public int findMinSteps(List<List<Integer>> ProductRating, int RatingThreshold) {
		
		double res = 0;
		int minSteps = 0;
		
		
		List<Double> temp = new ArrayList<Double>(ProductRating.size());
		
		while(res < (double) RatingThreshold) {
			
		res = 0;
		for(int i = 0; i < ProductRating.size(); i++) {
			
			double x = (double)ProductRating.get(i).get(0)/ProductRating.get(i).get(1);
			
			res += (double) ProductRating.get(i).get(0)/ProductRating.get(i).get(1);
			temp.add(i,x);
		}
		res = (res/ProductRating.size())*100;
		System.out.println(res);
		System.out.println(temp);
		
		int index = 0;
		
		if(res >= (double) RatingThreshold) {
			break;		
		}
		else {
	
				index = temp.indexOf(Collections.min(temp));
				System.out.println(index);
				
				ArrayList<Integer> ints = new ArrayList<>();
				
				
				ints.add(ProductRating.get(index).get(0) + 1);
				ints.add(ProductRating.get(index).get(1) + 1);
				System.out.println(ints);
				
				ProductRating.remove(index);
				ProductRating.add(index,ints);
				
				System.out.println(ProductRating);
				minSteps++;
				temp.clear();
			}
		}
		return minSteps; 
			
		}
	}

