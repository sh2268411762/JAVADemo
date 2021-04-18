package _4_18;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 30. 包含min函数的栈
 * @Date 2021/4/18 下午 19:48
 */
public class MinStack
{
    Deque<Integer> a;   //普通栈
    Deque<Integer> b;   //最小栈

    public MinStack()
    {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x)
    {
        a.push(x);  //压入普通栈
        if (b.isEmpty()) //如果最小栈为空，则将元素压入最小栈
        {
            b.push(x);
        } else
        {
            if (x <= b.peek())  //如果x小于最小值，则压入
            {
                b.push(x);
            } else
            {
                b.push(b.peek());   //否则将最小值再压入
            }
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
