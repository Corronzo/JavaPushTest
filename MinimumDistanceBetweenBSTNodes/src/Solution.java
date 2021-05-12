import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        
      int minDif = 0;
      Integer prev = null;
      
      if(root == null) return 0;
      
      minDiffInBST(root.left);
      
      if(prev != null) {
    	  minDif = Math.abs(root.val - prev);
      }
       
      prev = root.val;
      
      minDiffInBST(root.right);
       
     
    }
    public class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode() {}
    	      TreeNode(int val) { this.val = val; }
    	      TreeNode(int val, TreeNode left, TreeNode right) {
    	          this.val = val;
    	          this.left = left;
    	         this.right = right;
    	      }
    	 }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	TreeNode root = new TreeNode(4);
    	
    	
	}
}