package _4_13;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/13 下午 14:53
 */
public class reverseListDemo
{
    public ListNode reverseList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }
        if (head.next == null)
        {
            return head;
        }

        ListNode cur = head;
        ListNode prev = null;
        while (cur != null)
        {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public ListNode reverseList1(ListNode head)
    {
        if (head == null)
        {
            return null;
        }
        if (head.next == null)
        {
            return head;
        }

        ListNode cur = head;
        ListNode prev = null;
        ListNode newHead = null;

        while (cur != null)
        {
            ListNode temp = cur.next;
            cur.next = prev;
            if (temp == null)
            {
                newHead = cur;
            }
            prev = cur;
            cur = temp;
        }
        return newHead;
    }
}
