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
    int i = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
       dfs(root,k);  
       return result;       
    }

    public void dfs(TreeNode node, int k){
        if(node == null)
            return;
        dfs(node.left,k);
        i = i+1;
        if(i==k){
            // System.out.println("i=="+i+"k=="+k+"node.val=="+node.val+"lv==="+lv+"rv=="+rv);
            result =  node.val;
            
        }
        dfs(node.right,k);
        // System.out.println("sequence =="+i+"lv==="+lv+"rv=="+rv);
       
        // if(lv > 0)
        //     return lv;
        // else if(rv>0)
        //     return rv;
        // else return 0;
        return;
    }
}
