package _4_11;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 14- II. 剪绳子 II(I)
 * @Date 2021/4/11 下午 14:30
 */
public class cuttingRopeDemo
{
    public static void main(String[] args)
    {
        cuttingRopeDemo c = new cuttingRopeDemo();
        System.out.println(c.cuttingRope(120));
    }

    public int cuttingRope(int n)
    {
        if (n == 1 || n == 2)
        {
            return 1;
        }
        if (3 == n)
        {
            return 2;
        }
        long ret = 1;
        while (n > 4)
        {
            ret *= 3;
            ret %= 1000000007;
            n -= 3;
        }
        ret *= n;
        if (ret > 1000000007)
        {
            ret %= 1000000007;
        }
        return (int) ret;
    }

    public int cuttingRopeI(int n)
    {
        if (n == 1 || n == 2)
        {
            return 1;
        }
        if (3 == n)
        {
            return 2;
        }
        int ret = 1;
        while (n > 4)
        {
            ret *= 3;
            n -= 3;
        }
        return ret * n;
    }

}
