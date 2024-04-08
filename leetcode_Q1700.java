import java.util.LinkedList;
import java.util.Queue;
public class leetcode_Q1700 {
    public static void main(String[] args) {
        int students[] = {1,1,1,0,0,1};
        int sandwiches[] = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwiches));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int len2 = sandwiches.length;
        int len = students.length;
        for(int i=0;i<len;i++)
        {
            q.add(students[i]);
        }
        int j=0;
        while(j<len2)
        {
           if(q.peek()== sandwiches[j])
              {
                    q.remove();
                    j++;
              }
            else 
            {   
                Queue<Integer> qq = new LinkedList<>(q);
                q.add(q.peek());
                q.remove();
                if(q.equals(qq)) return q.size();
            }
            
        }
        return 0;
    }
}
