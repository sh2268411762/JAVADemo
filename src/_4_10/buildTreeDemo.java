package _4_10;

import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 07. 重建二叉树
 * @Date 2021/4/10 下午 21:05
 */

//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
public class buildTreeDemo
{
    //将指定数组的指定范围复制到新数组中。
    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        if (preorder.length == 0 || inorder.length == 0)    //任意一个数组为空则返回 null
        {
            return null;
        }

        int n = preorder.length;    //数组长度
        int rootVal = preorder[0], rootIndex = 0;
        //遍历数组
        for (int i = 0; i < n; i++)
        {
            if (inorder[i] == rootVal)
            {
                rootIndex = i;
                break;
            }
        }

        TreeNode root = new TreeNode(rootVal);   //定义根结点
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));
        return root;
    }
}
