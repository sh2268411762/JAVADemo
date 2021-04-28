package _4_25;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/27 上午 10:28
 */

public class TestDemo
{
    private int count;

    public static void main(String[] args)
    {
        TestDemo test = new TestDemo(88);
        System.out.println(test.count);
        long i = 0xfffL;
        double j = 0.999d;
    }

    TestDemo(int a)
    {
        count = a;
    }
}
