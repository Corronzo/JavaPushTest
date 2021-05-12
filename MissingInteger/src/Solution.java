import java.util.*;

public class Solution {
	
	public int findSmallestPositiveNumber(int[] A) {
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		
		Arrays.sort(A);
		int smallest = 1;
		for(int a : A) {
			
			if(a == smallest) {
				smallest = a + 1;
				if(!set.contains(smallest)) {
					return smallest;
				}
			}
			else if(a > smallest) {
				smallest = a - 1;
			}
			if(!set.contains(smallest)) {
				return smallest;
			}
		}
		return smallest;
	}
	
	public static void main(String args[]) {
		int[] A = {1, 3, 1, 1, 1, 1};
		Solution s = new Solution();
		
		System.out.println(s.findSmallestPositiveNumber(A));
	}
}
