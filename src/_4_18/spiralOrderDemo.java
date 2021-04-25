package _4_18;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 29. 顺时针打印矩阵
 * @Date 2021/4/18 下午 17:08
 */
public class spiralOrderDemo
{
    public int[] spiralOrder(int[][] matrix)
    {
        int row = matrix.length;    //矩阵的长度
        if (0 == row)   //长度为 0 ，则说明传入为空，返回 new int[0]
        {
            return new int[0];
        }
        int col = matrix[0].length; //到这一步则说明矩阵至少有一行，调用不会出现空指针异常
        int[] ret = new int[col * row];     //定义返回数组
        int index = 0;  //下标
        int left = 0, right = col - 1, top = 0, bottom = row - 1;  //定义循环所需变量
        while (true)
        {
            //从左向右
            for (int i = left; i <= right; i++)
            {
                ret[index++] = matrix[top][i];
            }
            if (++top > bottom)
            {
                break;
            }
            //从上往下
            for (int i = top; i <= bottom; i++)
            {
                ret[index++] = matrix[i][right];
            }
            if (--right < left)
            {
                break;
            }
            //从右向左
            for (int i = right; i >= left; i--)
            {
                ret[index++] = matrix[bottom][i];
            }
            if (--bottom < top)
            {
                break;
            }
            //从下往上
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
