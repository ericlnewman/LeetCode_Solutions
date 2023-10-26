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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // create two array lists to store the two tree nodes
        ArrayList<Integer> list = new ArrayList<>(), otherList = new ArrayList<>();
        // use the helper function on both of these arrays
        leafs(root1, list);
        leafs(root2, otherList);
        // compare the two lists, if they are not the same size, its false
        if(list.size() != otherList.size()){
            return false;
        }
        // if the elements in both tree nodes do not match, its false
        for(int i = 0; i < list.size(); i++){
            if(list.get(i)!=otherList.get(i)){
                return false;
            }
        } // otherwise true;
        return true;
        
    }
    public void leafs(TreeNode root, ArrayList<Integer> leaves){
        // fringe case
        if(root == null){
            return;
        }
        // declare fields
        TreeNode left = root.left, right = root.right;
        //if the nodes are both null, add to the array list
        if(left == null & right == null){
            leaves.add(root.val);
        }
        // recursive calls on both the right and left side of the tree
        leafs(left, leaves);
        leafs(right, leaves);
    }
}