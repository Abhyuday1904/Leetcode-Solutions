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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp= temp.next;
        }
        System.out.println(list);
        int ans[] = new int[list.size()];
        int k = ans.length-1;
        Stack<Integer> st = new Stack<>();
        for(int i = list.size()-1 ; i>=0. ; i--){
            if(st.isEmpty()){
                ans[k] = 0;
                k--;
            }
            else{
                if(st.peek()>list.get(i)){
                    ans[k] = st.peek();
                    k--;
                }
                else{
                    while(!st.isEmpty() && st.peek()<=list.get(i)){
                        st.pop();
                    }
                    if(st.isEmpty()){
                        ans[k] = 0;
                        k--;
                    }
                    else{
                        ans[k] = st.peek();
                        k--;
                    }
                }
                
            }
            st.add(list.get(i));
        }
        return ans;
    }
}