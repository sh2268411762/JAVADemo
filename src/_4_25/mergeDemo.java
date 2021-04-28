package _4_25;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 88. 合并两个有序数组
 * @Date 2021/4/26 下午 18:32
 */
public class mergeDemo
{
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        for (int i = 0; i < nums2.length; i++)
        {
            int end = m + n - 1;    //最后一个数字的下标
            while (n > 0)
            {
                //一共n个数，则n - 1 为nums2 要存进nums1的最后一个数
                if (0 == m || nums1[m - 1] <= nums2[n - 1])
                {
                    nums1[end--] = nums2[--n];
                } else
                {
                    nums1[end--] = nums1[--m];
                }
            }
        }
    }
}
