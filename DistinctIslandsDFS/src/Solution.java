import java.util.*;

public class Solution {

	public int numDistinctIslands(int[][] grid) {
		
		//X = start
		//O = out of bounds
		//U = up
		//D = down
		//R = right
		//L = left
		
		if(grid == null || grid.length == 0)
			return 0;

		Set<String> set = new HashSet<>();
		
		int m = grid.length;
		int n = grid[0].length;
		
		for(int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++) {
				
				if(grid[i][j] == 1) {
					String path = computePath(grid, i, j,m,n, "X");
					set.add(path);
				}
			}
		}
		return set.size();		
	}
	
	private String computePath (int[][] grid, int i, int j, int m, int n, String direction) {
		if(i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0)
			return "O";
		grid[i][j] = 0;
		String Left = computePath(grid, i, j - 1, m, n, "L");
		String Right = computePath(grid, i, j + 1, m, n, "R");
		String Up = computePath(grid, i - 1, j, m, n, "U");
		String Down = computePath(grid, i + 1, j, m, n, "D");
		
		return direction + Left + Right + Up + Down;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Islands [][] = new int [][] {{1, 1, 0, 0},{1,1,0,0},{0,0,0,1},{0,1,0,0},{0,1,0,1}};
		Solution s = new Solution();
		System.out.println(s.numDistinctIslands(Islands));
	}

}
