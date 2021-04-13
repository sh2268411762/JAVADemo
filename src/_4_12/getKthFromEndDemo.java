package _4_12;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 22. 链表中倒数第k个节点
 * @Date 2021/4/12 下午 16:05
 */
public class getKthFromEndDemo
{
    public ListNode getKthFromEnd(ListNode head, int k)
    {
        if (head == null || k < 0)
        {
            return null;
        }

        ListNode p = head, q = head;
        for (int i = 0; i < k; i++)
        {
            if (q != null)
            {
                q = q.next;
            } else
            {
                return null;
            }
        }
        while (q != null)
        {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
