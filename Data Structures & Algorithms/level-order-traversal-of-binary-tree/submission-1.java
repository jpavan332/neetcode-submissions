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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> bfs = new LinkedList<>();

        bfs.add(root);
        while(!bfs.isEmpty()){
            int levelSize = bfs.size();
            List<Integer> currList = new ArrayList<>();
            for(int i = 0;i < levelSize; i++){
                TreeNode curr = bfs.poll();
                currList.add(curr.val);
                if(curr.left != null){
                    bfs.add(curr.left);
                }
                if(curr.right !=null){
                    bfs.add(curr.right);
                }
            }
            result.add(currList);
        }
        return result;
    }
}
