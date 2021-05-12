import java.util.*;

public class Solution {
	public int getMaxSwitching(int[] A) {
		
		if (A.length<=2) return A.length;
		
		int ans = 2;
		int temp_ans = 2;
		
		for(int i = 2; i < A.length; i++) {	
			if(A[i] == A[i - 2])
			{
				temp_ans = temp_ans + 1;
			}
			else
			{
				temp_ans = 2;
			}
			ans = Math.max(temp_ans, ans);	
		}
		
		return ans;
	}
	public static void main(String[] args) {
		int[] A = {1, 2, 5, 2, 4, 4, 4, 4};
		Solution S = new Solution();
		
		System.out.println(S.getMaxSwitching(A));
	}
}
