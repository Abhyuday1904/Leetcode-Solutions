/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head; 
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        System.out.println(size);
        int arr[] = new int[size];
        temp = head;
        for(int i = 0; i<size;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        ListNode ans = new ListNode(arr[0]);
        ListNode tempp = ans;
        for(int i =1 ; i<size;i++){
            tempp.next = new ListNode(arr[i]);
            tempp =tempp.next;
        }
        return ans;
    }
}