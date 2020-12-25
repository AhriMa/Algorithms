package LinkedListProblems;

public class designLinkedList {

    private ListNode head;
    /** Initialize your data structure here. */


    /** Get the value of the index-th ListNode in the linked list. If the index is invalid, return -1. */
    public int Get(int index)
    {
        ListNode current = head;
        int i = 0;
        while (current != null && i < index)
        {
            current = current.next;
            i++;
        }

        if (current == null)
        {
            return -1;
        }

        // print();
        return current.val;

    }

    /** Add a ListNode of value val before the first element of the linked list. After the insertion, the new ListNode will be the first ListNode of the linked list. */
    public void AddAtHead(int val)
    {
        ListNode first = new ListNode(val);
        first.next = head;
        head = first;

    }

    /** Append a ListNode of value val to the last element of the linked list. */
    public void AddAtTail(int val)
    {

        ListNode current = head;
        ListNode previous = null;

        while (current != null)
        {
            previous = current;
            current = current.next;
        }

        if (previous == null)
        {
            head = new ListNode(val);
        }
        else
        {
            previous.next = new ListNode(val);
        }

    }

    /** Add a ListNode of value val before the index-th ListNode in the linked list. If index equals to the length of linked list, the ListNode will be appended to the end of linked list. If index is greater than the length, the ListNode will not be inserted. */
    public void AddAtIndex(int index, int val)
    {
        ListNode current = head;
        ListNode previous = null;
        if (index < 0)
        {
            return;
        }
        if (index == 0)
        {
            AddAtHead(val);

        }
        int i = 0;
        while (current.next != null && i < index)
        {
            previous = current;
            current = current.next;
            i++;


        }

        if (i == index)
        {
            previous.next = new ListNode(val);
            previous.next.next = current;
        }
    }

    /** Delete the index-th ListNode in the linked list, if the index is valid. */
    public void DeleteAtIndex(int index)
    {
        ListNode current = head;
        ListNode previous = null;

        if (index < 0)
        {
            return;
        }

        if (index == 0)
        {
            head = head.next;
            return;
        }

        int i = 0;
        while (current != null && i < index)
        {
            previous = current;
            current = current.next;
            i++;
        }

        if (i == index)
        {
            previous.next = current.next;

        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.Get(index);
 * obj.AddAtHead(val);
 * obj.AddAtTail(val);
 * obj.AddAtIndex(index,val);
 * obj.DeleteAtIndex(index);
 */

//1,2,3

