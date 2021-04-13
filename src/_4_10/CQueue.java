package _4_10;

import java.util.Stack;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/10 下午 21:34
 */
class CQueue
{

    private Stack<Integer> a;   //输入栈
    private Stack<Integer> b;   //输出栈

    public CQueue()
    {
        a = new Stack<>();
        b = new Stack<>();
    }

    public void appendTail(int value)   //尾插
    {
        a.push(value);
    }

    public int deleteHead() //头删
    {
        //如果 b 为空，则将 a 中的元素压入 b 中
        if (b.isEmpty())
        {
            if (a.isEmpty())
            {
                return -1;
            }
            while (!a.isEmpty())
            {
                b.push(a.pop());
            }
            return b.pop();
        } else
        {
            return b.pop();
        }
    }
}
