import java.util.Stack;

class MinStack {

    private Stack<Long> st;
    private long min;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {

        long x = val;

        if(st.isEmpty()) {
            st.push(x);
            min = x;
            return;
        }

        if(x >= min) {
            st.push(x);
        }
        else {
            st.push(2 * x - min);
            min = x;
        }
    }

    public void pop() {

        if(st.isEmpty()) return;

        long x = st.pop();

        if(x < min) {
            min = 2 * min - x;
        }
    }

    public int top() {

        long x = st.peek();

        if(x >= min) {
            return (int)x;
        }

        return (int)min;
    }

    public int getMin() {
        return (int)min;
    }
}