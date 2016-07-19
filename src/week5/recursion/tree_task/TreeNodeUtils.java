package week5.recursion.tree_task;

import java.util.List;

/**
 * Created by macaque on 19.07.2016.
 */
public class TreeNodeUtils {

    public static int count(TreeNode root) {

        int amount = root.amount;
        List<TreeNode> children = root.children;

        if (children == null){
            return amount;
        }

        for (TreeNode child : children) {
           int returnRes =  count(child);
            amount += returnRes;
        }

        return amount;
    }


}

