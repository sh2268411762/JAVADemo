package _4_11;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 10- I. 斐波那契数列
 * @Date 2021/4/11 上午 9:46
 */

//写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项
public class fibDemo
{
    public int fib(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        int f0 = 0, f1 = 1, f2 = f0 + f1;

        while (n > 2)
        {
            f0 = f1;
            f1 = f2;
            f2 = f1 + f0;
            if (f2 >= 1000000007)
            {
                f2 -= 1000000007;
            }
            n--;
        }
        return f2;
    }
}
