package _4_25;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 43. 1～n 整数中 1 出现的次数
 * @Date 2021/4/25 下午 17:39
 */
public class countDigitOneDemo
{
    public static void main(String[] args)
    {
        countDigitOneDemo c = new countDigitOneDemo();
        int n = c.countDigitOne(824883294);
        System.out.println(n);
    }

    public int countDigitOne(int n)
    {
        int count = 0;
        for (long i = 1; i < n + 1; i *= 10)
        {
            long temp = n / i;  //当前位 + 高位组成的数
            long t = n % i;     //低位数字
            count += (temp + 8) / 10 * i + (temp % 10 == 1 ? t + 1 : 0);
        }
        return count;
    }

    public int countDigitOne1(int n)
    {
        int count = 0;
        //必然大于等于 10
        for (long i = 1; i < n + 1; i++)
        {
            count += countOne(i);
        }
        return count;
    }

    private int countOne(long i)
    {
        int ret = 0;
        if (i < 10)
        {
            if (i == 1)
            {
                return 1;
            } else
            {
                return 0;
            }
        } else
        {
            if (i % 10 == 1) //如果 i 的最后一位为 1
            {
                ret += 1;
            }
            ret += countOne(i / 10);
        }
        return ret;
    }
}
