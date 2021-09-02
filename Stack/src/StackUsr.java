import java.util.*;

public class StackUsr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean x = true;
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println();
        while(x){
            System.out.println("Enter a choice");
            System.out.println("1: PUSH     2: POP    3:PEEK    4:SEARCH    5:Exit");
            int n = scan.nextInt();
            switch(n){
                case 1:
                    int num;
                    System.out.println("Enter the number you wanna push");
                    num = scan.nextInt();
                    stack_push(stack, num);
                    break;
                case 2:
                    stack_pop(stack);
                    break;
                case 3:
                    stack_peek(stack);
                    break;
                case 4:
                    System.out.println("Enter the element you wanna search");
                    int element = scan.nextInt();
                    stack_search(stack, element);
                    break;
                case 5:
                    x = false;
                    break;

            }
        }
    }
    static void stack_push(Stack<Integer> stack, int num){
        stack.push(num);
        System.out.println("Your current stack is:"+ stack);

    }
    static void stack_pop(Stack<Integer> stack){
        int y;
        y = stack.pop();
        System.out.println("The popped element is:  "+y);
        System.out.println("Your current stack is:"+ stack);

    }
    static void stack_peek(Stack<Integer> stack){
        Integer element = (Integer) stack.peek();
        System.out.println("The element on top is:  "+ element);

    }
    static void stack_search(Stack<Integer> stack, int element){
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);

    }
}
