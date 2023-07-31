import java.util.Stack;

public class ClosedParentheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();


        char [] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){
// System.out.println(stack);
            if (c[i] == '{' || c[i] == '[' || c[i] == '('){
                stack.push(c[i]);
            }

            else if(c[i] =='}' && stack.empty() == false){
                if(stack.peek() == '{'){
                    stack.pop();
                }
                else{stack.push(c[i]);}
                //  System.out.println(c[i]);
                //  return true;

            }
            else if(c[i] ==']' && stack.empty() ==false){
                if(stack.peek()== '['){

                    stack.pop();
                }
                else{stack.push(c[i]);}
                //  System.out.println(c[i]);
                //  return true;

            }
            else if(c[i] ==')' && stack.empty() ==false){
                //  System.out.println(stack);
                if (stack.peek() == '('){

                    stack.pop();
                }
                else{stack.push(c[i]);}
                //  System.out.println(c[i]);
                //  return true;


            }
            else{
                return false;}
            System.out.println(stack);

            // System.out.println(stack);

            // System.out.println(stack.pop());


        }


        // if(stack.peek() != null){return false;}
        // else
        // System.out.println(stack);
        if(stack.empty()){return true;}
        else{ return false;}


        // return true;

    }
}

