package _4_11;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 10- II. 青蛙跳台阶问题
 * @Date 2021/4/11 上午 10:07
 */

//一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
public class numWaysDemo
{
    public int numWays(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        if (n == 2)
        {
            return n;
        }

        int f1 = 1, f2 = 2, f3 = 0;
        for (int i = 3; i <= n; i++)
        {
            f3 = f1 + f2;
            while (f3 > 1000000007)
            {
                f3 -= 1000000007;
            }
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
