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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Map<Integer, List<Integer>>> map = new TreeMap<>();
        dfs(root,map,0,0);
        for(Map<Integer,List<Integer> >cols:map.values())
        {
            List<Integer> collist=new ArrayList<>();
            for(List<Integer> list:cols.values())
            {
                Collections.sort(list);
                collist.addAll(list);
            }
            res.add(collist);
        }
        return res;
    }
    private void dfs(TreeNode root,Map<Integer,Map<Integer,List<Integer>>> map,int c,int r)
    {
        if(root==null) return ;
        map.putIfAbsent(c,new TreeMap<>());
        map.get(c).putIfAbsent(r,new ArrayList<>());
        map.get(c).get(r).add(root.val);
        dfs(root.left,map,c-1,r+1);
        dfs(root.right,map,c+1,r+1);
    }
}