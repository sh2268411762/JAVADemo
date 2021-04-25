package _4_20;

import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 40. 最小的k个数
 * @Date 2021/4/20 下午 14:57
 */
public class getLeastNumbersDemo
{
    public int[] getLeastNumbers(int[] arr, int k)
    {
        //排序
        //Arrays.sort(arr);
        //bubbleSort(arr);
        //bsInsertSort(arr);
        //insertSort(arr);
        //selectSort(arr);
        selectSortDeformation(arr);

        int[] ret = new int[k];
        System.arraycopy(arr, 0, ret, 0, k);
        return ret;
    }

    private void selectSortDeformation(int[] arr)
    {
        for (int i = arr.length - 1, k = 0; i >= 0 && k < arr.length && k < i; i--, k++)
        {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int index = 0;

            for (int j = k; j <= i; j++)
            {
                if (max < arr[j])
                {
                    max = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];    //交换
            arr[i] = max;

            for (int j = k; j <= i - 1; j++)
            {
                if (min > arr[j])
                {
                    min = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[k];
            arr[k] = min;
        }
    }

    private void selectSort(int[] arr)
    {
        for (int i = arr.length - 1; i >= 0; i--)
        {
            int max = arr[0];
            int index = 0;

            for (int j = 0; j <= i; j++)   //找最大数
            {
                if (max < arr[j])
                {
                    max = arr[j];
                    index = j;
                }
            }

            arr[index] = arr[i];    //交换
            arr[i] = max;
        }
    }


    private void insertSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int temp = arr[i + 1];
            int j;
            for (j = i; j >= 0; j--)
            {
                if (temp < arr[j])
                {
                    arr[j + 1] = arr[j];
                } else
                {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    private void bsInsertSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int v = arr[i];
            int left = 0, right = i;

            while (left < right)
            {
                int m = (left + right) / 2;
                if (v >= arr[m])
                {
                    left = m + 1;
                } else
                {
                    right = m;
                }
            }
            for (int j = i; j > left; j--)
            {
                arr[j] = arr[j - 1];
            }
            arr[left] = v;
        }
    }

    private void bubbleSort(int[] arr)
    {
        boolean flag = true;    //如果没有进行交换，则说明数组已经有序
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = false;
                }
            }
            if (flag)
            {
                break;
            }
        }
    }
}
