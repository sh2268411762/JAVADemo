package _4_19;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 31. 栈的压入、弹出序列
 * @Date 2021/4/19 下午 21:07
 */
public class validateStackSequencesDemo
{
    public boolean validateStackSequences(int[] pushed, int[] popped)
    {
        List<Integer> pushList = IntArrayToList(pushed);    //插入列表
        List<Integer> popList = IntArrayToList(popped);     //删除列表

        Deque<Integer> stack = new LinkedList<>();
        while (!popList.isEmpty())  //删除列表不为空则进入
        {
            int pop = popList.remove(0);    //移除删除列表的第一个元素

            while (true)
            {
                if (stack.isEmpty() || stack.peek() != pop)  //栈为空或栈顶元素不为 pop 元素
                {
                    if (pushList.isEmpty())  //如果插入列表已经为空则返回false
                    {
                        return false;
                    }

                    int push = pushList.remove(0);
                    stack.add(push);
                } else
                {
                    break;
                }
            }
            stack.pop();    //移除栈顶元素---->到这一步则说明pop 元素与栈顶元素一样，则可以出栈
        }
        return stack.isEmpty();
    }

    private List<Integer> IntArrayToList(int[] pushed)  //将数组转换为列表
    {
        List<Integer> ret = new ArrayList<>();
        for (int j : pushed)
        {
            ret.add(j);
        }
        return ret;
    }
}
