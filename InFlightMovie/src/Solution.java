import java.time.Clock;
import java.util.*;

public class Solution {

		public List<Integer> movieCombinations(int [] MT, int FT){
			
			List<List<Integer>> set = new ArrayList<>();
			int [] tmp = Arrays.copyOfRange(MT, 0, MT.length);
			System.out.println(Arrays.toString(tmp));
			
			Arrays.sort(tmp);
			helper(tmp, set, FT);
			return set.get(0);
		}
		
		public void helper(int [] tmp, List<List<Integer>> set,  int FT ) {
			
			
			for(int i = tmp.length - 1; i  >= 0; i-- ) {
				
				for(int j = i - 1 ; j >= 0; j--) {
					
					if(FT - (tmp[i] + tmp[j])  == 30){
						List<Integer> tmp2 = new ArrayList<>();
						tmp2.add(tmp[i]);
						tmp2.add(tmp[j]);
						set.add(tmp2);
						break;
					}
				}
			}
			
		}
		public static void main(String[] args) {
			
			long start = System.nanoTime();
			
			int [] MT= new int [] {15, 5, 55, 65, 10, 30, 15, 45, 0};
			System.out.println(Arrays.toString(MT));
			
			int FT = 100;
			Solution s = new Solution();
			List<Integer> result = s.movieCombinations(MT,FT);
			
			long end = System.nanoTime();
			
			System.out.println((end - start)/1000000);
			System.out.println(result);
			System.out.println(Arrays.toString(MT));
			//System.out.println(Arrays.);
		}
}