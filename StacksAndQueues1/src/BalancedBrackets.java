import java.util.Stack;
public class BalancedBrackets {

    public static String isBalanced(String input) {

        Stack<Character> stack = new Stack<Character>();

        //loop to add all of the forward open facing brackets
        for(int i = 0; i<input.length(); i++) {
            char x = input.charAt(i);

            //push all of the open brackets onto the array
            if(x == '(' || x == '{' || x == '[') {
                stack.push(x);
            }

            if(stack.isEmpty()) {
                return "False";
            }

            char check;
            if(x == ')') {
                check = stack.pop();
                if(check == '{' || check == '[') {
                    return "False";
                }
            }
            else if(x == ']') {
                check = stack.pop();
                if(check == '{' || check == '(') {
                    return "False";
                }
            }
            else if(x == '}') {
                check = stack.pop();
                if(check == '(' || check == '[') {
                    return "False";
                }
            }
        }

        return "Balanced";
    }

    public static void main(String[] args) {
        String input = "{[()]}";

        BalancedBrackets bb = new BalancedBrackets();
        String result = bb.isBalanced(input);
        System.out.println(result);


    }



}
