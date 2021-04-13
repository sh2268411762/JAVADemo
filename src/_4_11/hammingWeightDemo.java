package _4_11;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 15. 二进制中1的个数
 * @Date 2021/4/11 下午 15:11
 */

//统计二进制中1的个数
public class hammingWeightDemo
{
    public static void main(String[] args)
    {
        hammingWeightDemo h = new hammingWeightDemo();
        System.out.println(h.hammingWeight(13));
    }

    public int hammingWeight(int n)
    {
        int count = 0;
        while (n != 0)
        {
            if ((n & 1) == 1)
            {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }

    public int hammingWeight1(int n)
    {
        int count = 0;
        while (n != 0)
        {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
