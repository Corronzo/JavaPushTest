package amazon;
import java.util.*;

public class Solution {

	public List<String> processLogs(List<String> logs, int threshold){
		
		
		Map<String, Integer> set = new HashMap<>();
		List<String> result = new ArrayList<>();
		
		for (String S : logs) {
			
			String [] tmp = S.split(" ");
			if (tmp[0] == tmp[1]) {
				if(!set.containsKey(tmp[0])) {
					set.put(tmp[0], 0);
				}
				set.put(tmp[0], set.get(tmp[0]) + 1);
			}
			else {
				if(!set.containsKey(tmp[0])) {
					set.put(tmp[0], 0);
				}
				if(!set.containsKey(tmp[1])) {
					set.put(tmp[1], 0);
				}
				set.put(tmp[0], set.get(tmp[0]) + 1);
				set.put(tmp[1], set.get(tmp[1]) + 1);
			}			
		}
		for(Map.Entry<String, Integer> m : set.entrySet())
		{
			if(m.getValue() > threshold) {
				
				result.add(m.getKey());
			}
		}
		Collections.sort(result);
		
		return result;
	}
	
	
	public static void main(String args[]) {
		List<String> logs = new ArrayList<>();
		List<String> result = new ArrayList<>();
		
		String S1 = "8888 1111 12";
		String S2 = "8888 1111 11";
		String S3 = "8888 1111 13";
		String S4 = "9999 9999 10";
		String S5 = "9999 9999 10";
		String S6 = "9999 9999 10";
		
		logs.add(S1);
		logs.add(S2);
		logs.add(S3);
		logs.add(S4);
		logs.add(S5);
		logs.add(S6);
		
		Solution s = new Solution();
		
		result = s.processLogs(logs, 2);
		
		System.out.println(result);
		
	}
}
