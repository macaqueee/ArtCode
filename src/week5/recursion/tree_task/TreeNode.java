package week5.recursion.tree_task;

import java.util.List;

/**
 * Created by macaque on 19.07.2016.
 */
public class TreeNode {

    public int amount;
    public List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(int amount){
        this.amount = amount;
    }
    public TreeNode(int amount, List<TreeNode> slaves) {
        this.amount = amount;
        this.children = slaves;
    }


}
