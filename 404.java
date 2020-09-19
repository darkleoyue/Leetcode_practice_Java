/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int sumLeaves = 0;

    public void checkLeftLeave(TreeNode node){
            if (node == null){
                return ;
            }
            
            if (node.left != null && node.left.left == null && node.left.right == null){
                sumLeaves += node.left.val;
                sumOfLeftLeaves(node.right);
            }else{
                sumOfLeftLeaves(node.right);
                sumOfLeftLeaves(node.left);
            }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        checkLeftLeave(root);
        return sumLeaves;
    }
}
