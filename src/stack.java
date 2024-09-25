import java.util.Stack;

public class stack {
    public static void main(String[] args){

        Stack<String> stack = new Stack<>();

        // adding elements to the stack
        stack.push("dog");
        stack.push("cat");
        stack.push("goat");
        stack.push("cow");


        System.out.println("Top element:" + stack.peek());

        System.out.println("pop element : " + stack.pop());

        System.out.println("is the stack empty? " + stack.isEmpty());

        System.out.println("stack size: " + stack.size());


    }
}
