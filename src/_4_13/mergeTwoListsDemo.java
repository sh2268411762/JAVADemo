package _4_13;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 25. 合并两个排序的链表
 * @Date 2021/4/13 下午 16:24
 */

//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
public class mergeTwoListsDemo
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1 == null && l2 == null)
        {
            return null;
        }
        if (l1 == null)
        {
            return l2;
        }
        if (l2 == null)
        {
            return l1;
        }

        //判断头结点
        ListNode head = null;
        if (l1.val <= l2.val)
        {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else
        {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode cur = head;
        while (l1 != null && l2 != null)
        {
            ListNode temp = null;
            if (l1.val <= l2.val)
            {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            } else
            {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur.next = temp;
            cur = cur.next;
        }

        //结束时必有一个为空
        if (l1 != null)
        {
            cur.next = l1;
        } else
        {
            cur.next = l2;
        }
        return head;
    }
}
