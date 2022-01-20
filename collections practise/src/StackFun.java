import java.util.Stack;

public class StackFun {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Rajesh");
        stack.push("divya");
        stack.push("Amit");
        stack.push("bhavya");
        stack.push("pardhu");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
