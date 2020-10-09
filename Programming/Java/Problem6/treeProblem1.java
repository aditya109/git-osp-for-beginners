// sum of all nodes using Recursion

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
    

    // sum all the nodes 
    private void backtrack(TreeNode root,String str,List<String> res)
    {
        if(root != null)
        {
            backtrack(root.left,str+""+root.val,res);
            if(root.left == null && root.right == null ) res.add(str+""+root.val);
            backtrack(root.right,str+""+root.val,res);
        }
        
    }
    

    public int sumRootToLeaf(TreeNode root) 
    {
        List<String> res = new ArrayList<>();
        backtrack(root,"",res);
        int ans = res.stream().map(e-> Integer.parseInt(e,2)).reduce((a,b)->a+b).get();
        return ans;
    }
}

