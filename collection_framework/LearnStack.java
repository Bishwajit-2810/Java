import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        // creating stack
        Stack<Integer> st = new Stack<>();

        // pushing to stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        // peeking in stack
        System.out.println(st.peek());

        // popping from stack
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);

        //clear the stack
        st.clear();
        System.out.println(st);

    }

}
