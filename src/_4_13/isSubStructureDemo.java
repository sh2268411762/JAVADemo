package _4_13;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 26. 树的子结构
 * @Date 2021/4/13 下午 20:55
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

public class isSubStructureDemo
{
    public boolean isSubStructure(TreeNode A, TreeNode B)
    {
        return search(A, B);
    }

    private boolean search(TreeNode root, TreeNode t)
    {
        if (root == null)
        {
            return false;
        }
        if (root.val == t.val)
        {
            if (isSameTree(root, t))
            {
                return true;
            }
        }
        if (search(root.left, t))
        {
            return true;
        }
        return search(root.right, t);
    }

    private boolean isSameTree(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
        {
            return true;
        }

        if (p == null || q == null)
        {
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
