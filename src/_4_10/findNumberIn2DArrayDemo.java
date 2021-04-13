package _4_10;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *              请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * * @Date 2021/4/10 下午 19:52
 */
public class findNumberIn2DArrayDemo
{
    //从右上角开始寻找
    public boolean findNumberIn2DArray(int[][] matrix, int target)
    {
        if (matrix == null || matrix.length == 0)
        {
            return false;
        }

        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0)
        {
            if (matrix[row][col] < target)   //该数小于目标数，则向下一行寻找
            {
                row++;
            } else if (matrix[row][col] > target)  //该数大于目标数，向前寻找
            {
                col--;
            } else    //找到了
            {
                return true;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArray1(int[][] matrix, int target)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] == target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
