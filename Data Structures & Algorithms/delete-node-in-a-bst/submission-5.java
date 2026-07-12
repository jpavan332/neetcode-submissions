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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        else if(key > root.val)
           root.right = deleteNode(root.right,key);
        else if(key < root.val)
            root.left = deleteNode(root.left,key);
        else{
            if(root.left == null && root.right == null){
                System.out.println("stack trace 2:"+root.val);
                return null;
            }
            else if(root.right == null)
                return root.left;
            else if(root.left == null)
                return root.right;
            else{
                TreeNode minNode = findMin(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right,minNode.val);
            }

        }
        return root;
        
    }

    TreeNode findMin(TreeNode node){
        TreeNode curr = node;
        TreeNode min = curr;
        while(curr !=null){
            System.out.println("Minimum-Curr_val"+curr.val);
            if(min.val > curr.val)
                min = curr;
            curr = curr.left;
        }
        System.out.println("Minimum"+min.val);
        return min;
    }
}