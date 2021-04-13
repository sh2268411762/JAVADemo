package _4_10;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/10 下午 20:27
 */
public class reversePrintDemo
{
    //遍历
    public int[] reversePrint(ListNode head)
    {
        int[] ret = new int[getLength(head)];
        ListNode cur = head;
        int i = ret.length - 1;
        while (cur != null)
        {
            ret[i] = cur.val;

            //更新
            i--;
            cur = cur.next;
        }
        return ret;
    }

    private int getLength(ListNode head)
    {
        if (head == null)
        {
            return 0;
        }
        int length = 0;
        ListNode cur = head;
        while (cur != null)
        {
            length++;
            cur = cur.next;
        }
        return length;
    }
}
