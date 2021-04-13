package _4_12;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 18. 删除链表的节点
 * @Date 2021/4/12 下午 15:29
 */


public class deleteNodeDemo
{
    public ListNode deleteNode(ListNode head, int val)
    {
        if (head == null || (head.val == val && head.next == null))
        {
            return null;
        }
        //空链表，只有一个结点且为删除结点

        if (head.val == val)
        {
            return head.next;
        }
        //删除头结点

        ListNode cur = head.next;
        ListNode prev = head;
        prev.next = cur;
        while (cur != null)
        {
            if (cur.val != val)
            {
                prev.next = cur;
                prev = cur;
                cur = cur.next;
            } else
            {
                cur = cur.next;
            }
        }

        prev.next = null;

        return head;
    }
}
