package _4_11;

import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 11. 旋转数组的最小数字
 * @Date 2021/4/11 下午 13:58
 */


//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
// 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
// 例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。

public class minArrayDemo
{
    public int minArray(int[] numbers)
    {
        int min = numbers[0];
        for (int number : numbers)
        {
            if (min >= number)
            {
                min = number;
            } else
            {
                return number;
            }
        }
        return min;
    }

    public int minArray1(int[] numbers)
    {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
