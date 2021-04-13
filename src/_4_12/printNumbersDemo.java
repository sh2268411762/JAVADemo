package _4_12;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 17. 打印从1到最大的n位数
 * @Date 2021/4/12 下午 15:14
 */

//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
public class printNumbersDemo
{
    public int[] printNumbers(int n)
    {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i++ < Math.pow(10, n) - 1)
        {
            stringBuilder.append(i).append(",");
        }
        String[] strings = stringBuilder.toString().split(",");
        int[] ret = new int[strings.length];
        for (int j = 0; j < ret.length; j++)
        {
            ret[j] = Integer.parseInt(strings[j]);
        }
        return ret;
    }
}
