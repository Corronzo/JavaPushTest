import java.util.*;
//Robot that has 3 commands "L" - turn left "R" - turn right "G" - go forward. Given list of commands build a function that return a list of strings of YES or NO, YES if there exists a loop for each set of input commands such that the robot returns to it's original location.

public class Solution {

	public List<String> loopExists(List<String> s){
		
		List<String> result = new ArrayList<>();
		for(String x : s) {
			
			if(helper(x)) {
				result.add("YES");
			}
			else {
				result.add("NO");
			}
		}
		return result;
		
	}
	public boolean helper (String s) {
		
		String direction = "up"; //North default direction
		int updown = 0;
		int leftright = 0;
		
		if(s.isEmpty()) {
			return false;
		}
		for(int i = 0; i < s.length(); i++){
			
			System.out.println(s.substring(i, i+1));
			if(direction.equals("up") && s.substring(i, i+1).equals("L")) {
				direction = "left";
			}
			if(direction.equals("up") && s.substring(i, i+1).equals("R")) {
				direction = "right";
			}
			if(direction.equals("down") && s.substring(i, i+1).equals("L")) {
				direction = "right";
			}
			if(direction.equals("down") && s.substring(i, i+1).equals("R")) {
				direction = "left";
			}
			if(direction.equals("left") && s.substring(i, i+1).equals("L")) {
				direction = "down";
			}
			if(direction.equals("left") && s.substring(i, i+1).equals("R")) {
				direction = "up";
			}
			if(direction.equals("right") && s.substring(i, i+1).equals("L")) {
				direction = "up";
			}
			if(direction.equals("right") && s.substring(i, i+1).equals("R")) {
				direction = "down";
			}
			else if (s.substring(i, i+1).equals("G")) {
				//increment direction 
				
				if (direction.equals("up")) {
					updown++;
				}
				if (direction.equals("down")) {
					updown--;
				}
				if (direction.equals("left")) {
					leftright--;
				}
				if (direction.equals("right")) {
					leftright++;
				}			
			}
		}
		return (updown == 0 && leftright == 0);
		
	}
	
	/*//recursive solution
	public boolean helper2 (String s, String direction, int x, int y) {
		
		 //North default direction
		
		
		if(s.isEmpty()) {
			return false;
		}
		if(s.substring(0, 1).equals("L") && direction.equals("up")) {
			helper2(s.substring(1, s.length()), "left", 0, 0  );
		}
		if(s.substring(0, 1).equals("R") && direction.equals("up")) {
			helper2(s.substring(1, s.length()), "right", 0, 0  );
		}
		if(s.substring(0, 1).equals("L") && direction.equals("down")) {
			helper2(s.substring(1, s.length()), "right", 0, 0  );
		}
		if(s.substring(0, 1).equals("R") && direction.equals("down")) {
			helper2(s.substring(1, s.length()), "left", 0, 0  );
		}
		if(s.substring(0, 1).equals("L") && direction.equals("left")) {
			helper2(s.substring(1, s.length()), "right", 0, 0  );
		}
		if(s.substring(0, 1).equals("R") && direction.equals("left")) {
			helper2(s.substring(1, s.length()), "up", 0, 0  );
		}
		if(s.substring(0, 1).equals("L") && direction.equals("right")) {
			helper2(s.substring(1, s.length()), "up", 0, 0  );
		}
		if(s.substring(0, 1).equals("L") && direction.equals("right")) {
			helper2(s.substring(1, s.length()), "down", 0, 0  );
		}
			
		
		return (updown == 0 && leftright == 0);
		
	}*/

	public static void main(String args[]) {
		List<String> input = new ArrayList<>();
		input.add("RGRGRGRG");
		input.add("LGLGLGL");
		Solution s  = new Solution();
		
		System.out.println(s.loopExists(input));
	}
}
