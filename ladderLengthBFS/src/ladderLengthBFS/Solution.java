package ladderLengthBFS;
import java.util.*;

public class Solution {
	public int ladderLengthBFS(String beginWord, String endWord, List<String> wordlist) {
		
		
		Set<String> set = new HashSet<>(wordlist);
		if(!set.contains(endWord)){
			return 0;
		}
		
		Queue<String> queue = new  LinkedList<>();
		queue.add(beginWord);
		
		Set<String> visited = new HashSet<>();
		visited.add(beginWord);
		
		int changes = 1;
		while(!(queue.isEmpty())) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				
				String word = queue.poll();
				if(word.equals(endWord)) return changes;
				for(int j = 0; j < word.length(); j++) {
					
					for(int k = 'a'; k <= 'z'; k++) {
						
						char [] arr = word.toCharArray();
						arr[j] = (char) k;
						
						String str = new String(arr);
						
						if(set.contains(str) && !visited.contains(str)) {
							
							queue.add(str);
							visited.add(str);
							
						}
					}
				}
			}
			
			changes++;
		}
		
		return changes;
	}
	
	public static void main(String[] args) {
		
		List<String> wordlist = new ArrayList<>();
		wordlist.add("ce");
		wordlist.add("mo");
		wordlist.add("ko");
		wordlist.add("me");
		wordlist.add("co");
		
		Solution s = new Solution();
		
		
		System.out.println(s.ladderLengthBFS("be", "ko", wordlist));
	}
}
