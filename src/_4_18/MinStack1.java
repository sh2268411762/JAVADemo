package _4_18;

import java.util.Stack;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/18 下午 20:06
 */
public class MinStack1
{
    Stack<Integer> a;
    Stack<Integer> b;

    public MinStack1()
    {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void push(int x)
    {
        a.push(x);
        if (b.isEmpty() || x <= b.peek())
        {
            b.push(x);
        } else
        {
            b.push(b.peek());
        }
    }

    public void pop()
    {
        a.pop();
        b.pop();
    }

    public int top()
    {
        return a.peek();
    }

    public int min()
    {
        return b.peek();
    }
}
