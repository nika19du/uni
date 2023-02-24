import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        //STACK: LAST IN FIRST OUT
        Stack<String> stack = new Stack<String>();
        stack.push("bottom");
        printStack(stack);
        stack.push("second");
        printStack(stack);
        stack.push("third");
        printStack(stack);
        System.out.println("_Pop out here_");
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);

    }

    private static void printStack(Stack<String> s){
        if(s.isEmpty()){
            System.out.println("you have nothing in ur stack");
        }
        else {
            System.out.printf("%s  TOP\n",s);
        }
    }
}
