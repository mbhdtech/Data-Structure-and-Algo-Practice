// LC 103
// Process tree in zig zag order and store each level in a list.
// Then return a list with the lists for each level

import java.util.*;
public class LC_103{
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(zigzagLevelOrder(root));
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        dfs(list, root, 0);
        return list;
    }

    public static void dfs(List<List<Integer>> list, TreeNode root, int level){
        if(root == null){
            return;
        }
        if(list.size() <= level){
            list.add(new LinkedList<Integer>());
        }

        List<Integer> currLevelNums = list.get(level);
        if(level % 2 == 0) currLevelNums.add(root.val);
        else {currLevelNums.add(0, root.val);}

        dfs(list, root.left, level+1);
        dfs(list, root.right, level+1);
    }
}

class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}
