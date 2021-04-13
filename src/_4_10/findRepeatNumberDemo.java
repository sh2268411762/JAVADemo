package _4_10;

import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 03. 数组中重复的数字
 * @Date 2021/4/10 下午 19:06
 */
public class findRepeatNumberDemo
{
    //新建一个数组，该数组的长度与输入数组相同
    //由于题目给了数组值的范围，i 的值最大也不过是 num[num.length - 1]，所以新数组并不会越界
    public int findRepeatNumber(int[] nums)
    {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            arr[nums[i]]++;
            if (arr[nums[i]] > 1)
            {
                return nums[i];
            }
        }
        return -1;
    }

    //先排序，再遍历
    public int findRepeatNumber1(int[] nums)
    {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++)
        {
            if (i + 1 < nums.length && nums[i] == nums[i + 1])
            {
                return nums[i];
            }
        }
        return -1;
    }
}
