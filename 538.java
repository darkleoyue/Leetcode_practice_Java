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
    
    public int sumTemp = 0;

    public TreeNode convertBST(TreeNode root) {
        
        convert(root);
        return root;

    }

    public void convert(TreeNode node){
        
        if(node == null){
            return;
        }

        convert(node.right);
        sumTemp += node.val;
        node.val = sumTemp;
        convert(node.left);
    
    }
}
