package easyquestions.array.addTwoNumbers;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first list:");
        int m = sc.nextInt();
        System.out.println("Enter the size of second list:");
        int n = sc.nextInt();

        ListNode temp = new ListNode(0);
        ListNode l1 = temp;
        for (int i = 0; i < m; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        ListNode temp2 = new ListNode(0);
        ListNode l2 = temp2;
        for (int j = 0; j < n; j++) {
            temp2.next = new ListNode(sc.nextInt());
            temp2 = temp2.next;
        }

        ListNode temp3 = l1.next;
        ListNode temp4 = l2.next;

        printList(addTwoNumbers(temp3, temp4));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            tail.next = new ListNode(sum % 10);
            carry = sum / 10;
            tail = tail.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
