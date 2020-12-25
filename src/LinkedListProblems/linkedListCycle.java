package LinkedListProblems;

import java.util.HashSet;

public class linkedListCycle {

    public boolean  HasCycle(ListNode head)
    {
        ListNode fast = head.next;
        ListNode slow = head;
        if (head.next == null || head == null)
            return false;
        while (fast != slow && slow != null && fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (slow == fast)
        { return true; }
        else
            return false;


    }


    public ListNode DetectCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        if (head == null || head.next == null)
            return null;
        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null)
        { return null; }
        slow = head;
        while (slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;



    }

    public ListNode DetectCycleHash(ListNode head)
    {
        var hs = new HashSet<ListNode>();
        var node = head;
        while (node != null&& node.next!= null)
        {
            hs.add(node);
            node = node.next;
            if (hs.contains(node))
            {
                return node;
            }
        }
        return null;
    }
}


