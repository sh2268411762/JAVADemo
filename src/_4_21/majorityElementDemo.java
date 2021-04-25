package _4_21;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 39. 数组中出现次数超过一半的数字
 * @Date 2021/4/21 下午 16:05
 */
public class majorityElementDemo
{
    public static void main(String[] args)
    {
        System.out.println(majorityElement(new int[]{7, 6, 7, 6, 6}));
    }

    public static int majorityElement(int[] nums)
    {
        //Arrays.sort(nums);
        //bubbleSort(nums);
        //insertSort(nums);
        bsInsertSort(nums);
        return nums[nums.length / 2];
    }

    private static void bsInsertSort(int[] nums)
    {
        for (int i = 1; i < nums.length; i++)
        {
            int temp = nums[i];
            int left = 0, right = i;
            while (left < right)
            {
                int m = (left + right) / 2;
                if (nums[m] <= temp)
                {
                    left = m + 1;
                } else
                {
                    right = m;
                }

                if (i - left >= 0)
                {
                    System.arraycopy(nums, left, nums, left + 1, i - left);
                }
                nums[left] = temp;
            }
        }
    }

    private void insertSort(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            int temp = nums[i + 1];

            int j;
            for (j = i; j >= 0; j--)
            {
                if (nums[j] > temp)
                {
                    nums[j + 1] = nums[j];
                } else
                {
                    break;
                }
            }
            nums[j + 1] = temp;
        }
    }

    private void bubbleSort(int[] nums)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            boolean flag = true;
            for (int j = 0; j < nums.length - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    flag = false;
                }
            }
            if (flag)
            {
                break;
            }
        }
    }

    public int majorityElement2(int[] nums)
    {
        if (nums.length <= 0)
        {
            return -1;
        }
        int count = 0;
        Integer card = null;
        for (int num : nums)
        {
            if (0 == count)
            {
                card = num;
            }
            count += (card == num) ? 1 : -1;
        }
        return card;
    }

    public int majorityElement1(int[] nums)
    {
        Map<Integer, Integer> map = new TreeMap<>();

        for (int num : nums)
        {
            if (!map.containsKey(num))
            {
                map.put(num, 0);
            } else
            {
                map.put(num, map.get(num) + 1);
            }
        }
        //
        int n = nums.length / 2;
        for (int num : nums)
        {
            if (map.get(num) >= n)
            {
                return num;
            }
        }
        return -1;
    }
}
