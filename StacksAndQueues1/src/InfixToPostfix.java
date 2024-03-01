import java.util.ArrayList;
import java.util.Stack;

//has errors with brackets and exponents
public class InfixToPostfix {
    public static String infixToPostfix(String input) {

        //stack to push operators on
        Stack<String> operators = new Stack<>();
        ArrayList<String> postfix = new ArrayList<>();

        //for each digit or letter in the input, check if it is an operand or not
        for(String current : input.split("")) {
            if(isAnOperator(current)) {
                //if the current has a lower precedence, push the one that was already on
                //the stack onto the postfix
                //OR something else
                while(!operators.isEmpty() && checkLowerPrecedence(current, operators.peek())) {
                        postfix.add(operators.pop());
                }
               operators.push(current);
            }
//            if(current.equals(")")) {
//                while(!operators.isEmpty() && operators.peek() != "(") {
//                    postfix.add(operators.pop());
//                } }
            else {
                postfix.add(current);
            }
        }
        //after we went through the whole infix, then we pop each and add it to output
        while(!operators.empty()) {
            postfix.add(operators.pop());
        }

        //loop to print out the postfix
        String result = "";
        for(int i = 0; i<postfix.size(); i++) {
            result = result + postfix.get(i);
        }
        return result;
    }

    //method to compare the two operators and see which has lower precedence
    public static boolean checkLowerPrecedence(String o, String o1){
        if(comesFirst(o)<comesFirst(o1)) {
            return true;
        }
        return false;
    }

    //gives each operator a value to see which would be performed first
    public static int comesFirst(String o) {
        if(o.equals("+") ||o.equals("-")) {
            return 1;
        }
        if(o.equals("/")||o.equals("*")) {
            return 2;
        }
        if(o.equals("^")) {
            return 3;
        }
        return -1;
    }

    //method to check if the current character is an operator
    public static boolean isAnOperator(String o) {
        String[] operators = {"+", "-", "*", "/", "^"};
        for(int i = 0; i<operators.length; i++) {
            if(operators[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String exp = "a+b*c^d-e^f+g*h-i";

        // Function call
        String result = infixToPostfix(exp);
        System.out.println(result);
    }

}
