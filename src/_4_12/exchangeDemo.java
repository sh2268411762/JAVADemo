package _4_12;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * @Date 2021/4/12 下午 15:55
 */

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
public class exchangeDemo
{
    public int[] exchange(int[] nums)
    {
        int left = 0, right = nums.length - 1;
        while (left < right)
        {
            while (nums[left] % 2 == 1 && left < right)
            {
                left++;
            }
            while (nums[right] % 2 == 0 && left < right)
            {
                right--;
            }
            if (left < right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }
}
