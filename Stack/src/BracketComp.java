import java.util.*;

public class BracketComp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        boolean result;
        System.out.println("Enter the String you want to compare");
        String input = scan.nextLine();
        result = is_balanced(stack, input);
        System.out.println(result);

    }
    public static boolean is_balanced(Stack<Character> stack, String st){
        for(int i = 0;i<st.length(); i++){
            char x = st.charAt(i);
            if (x =='{' || x =='[' || x=='(' || x==']' || x=='}' || x==')'){
                if (x == '(' || x == '[' || x== '{')
                {
                    stack.push(x);
                    continue;
                }
                if (stack.isEmpty())
                    return false;

                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }
            }
        }
        return (stack.isEmpty());
    }
}
