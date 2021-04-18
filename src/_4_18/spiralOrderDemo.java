package _4_18;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 29. 顺时针打印矩阵
 * @Date 2021/4/18 下午 17:08
 */
public class spiralOrderDemo
{
    public static void main(String[] args)
    {
        int[][] a = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        spiralOrderDemo s = new spiralOrderDemo();
        int[] b = s.spiralOrder(a);
        for (int i : b
        )
        {
            System.out.print(i + " ");
        }
    }

    public int[] spiralOrder(int[][] matrix)
    {
        int row = matrix.length;
        if (0 == row)
        {
            return new int[0];
        }

        int col = matrix[0].length;
        int[] ret = new int[row * col];
        int index = 0;
        int left = 0, right = col - 1, top = 0, bottom = row - 1;
        while (true)
        {
            //从左到右
            for (int i = left; i <= right; i++)
            {
                ret[index++] = matrix[left][i];
            }
            if (++top > bottom)
            {
                break;
            }
            //从上到下
            for (int i = top; i <= bottom; i++)
            {
                ret[index++] = matrix[i][right];
            }
            if (--right < left)
            {
                break;
            }
            //从右到左
            for (int i = right; i >= left; i--)
            {
                ret[index++] = matrix[bottom][i];
            }
            if (--bottom < top)
            {
                break;
            }
            //从下到上
            for (int i = bottom; i >= top; i--)
            {
                ret[index++] = matrix[i][left];
            }
            if (++left > right)
            {
                break;
            }
        }
        return ret;
    }
}
