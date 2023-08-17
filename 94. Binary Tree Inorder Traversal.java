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
    // List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if(root == null) return list;

        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(root!=null){
                stack.push(root);
                root = root.left;
            }else{
                if(stack.isEmpty()) break;
                root = stack.peek();
                list.add(root.val);
                stack.pop();
                root = root.right;
            }
        }
        return list;



        
        // if(root==null) return list;

        // inorderTraversal(root.left);
        // list.add(root.val);
        // inorderTraversal(root.right);

        // return list;
    }
}
