package _4_11;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 16. 数值的整数次方
 * @Date 2021/4/11 下午 16:07
 */
public class myPowDemo
{
    public static void main(String[] args)
    {
        myPowDemo m = new myPowDemo();
        System.out.println(m.myPow(2.00000, -2147483648));
    }

    public double myPow(double x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        if (1 == n)
        {
            return x;
        }
        if (n == -1)
        {
            return 1 / x;
        }
        double ret = myPow(x, n / 2);
        double mod = myPow(x, n % 2);
        return ret * ret * mod;
    }
}
