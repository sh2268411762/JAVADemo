package _4_25;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 42. 连续子数组的最大和
 * @Date 2021/4/25 下午 17:30
 */
public class maxSubArrayDemo
{
    public int maxSubArray(int[] nums)
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums)
        {
            if (sum <= 0)
            {
                sum = num;
            } else
            {
                sum += num;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
