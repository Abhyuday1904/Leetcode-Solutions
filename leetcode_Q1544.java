import java.util.Stack;

public class leetcode_Q1544 {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }

    public static String makeGood(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for (int i = 1; i < len; i++) {

            Character ch = s.charAt(i);
            if (st.isEmpty())
                st.push(ch);
            else {
                int curr = (int) st.peek();
                int after = (int) ch;
                if (curr - after == 32)
                    st.pop();
                else
                    st.push(ch);
            }
        }
        Stack<Character> stt = new Stack<>();
        while(st.size()>0)
        {
            stt.push(st.pop());
        }
        System.out.println(stt.toString());
        StringBuilder sb = new StringBuilder();
        while(stt.size()>0) sb.append(stt.pop());
        return sb.toString();
    }
}
