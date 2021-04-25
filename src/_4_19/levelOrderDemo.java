package _4_19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 32 - I. 从上到下打印二叉树
 * @Date 2021/4/19 下午 21:25
 */

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x)
    {
        val = x;
    }
}

public class levelOrderDemo
{
    public int[] levelOrder(TreeNode root)
    {
        if (root == null)
        {
            return new int[0];
        }

        Queue<TreeNode> queue = new LinkedList<>(); //保存结点
        List<Integer> list = new ArrayList<>();     //保存 val
        queue.add(root);    //头结点必不为空

        while (!queue.isEmpty())
        {
            TreeNode node = queue.poll();
            list.add(node.val);

            if (node.left != null)
            {
                queue.add(node.left);
            }
            if (node.right != null)
            {
                queue.add(node.right);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
