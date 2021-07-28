package com.example.mycalculatorapp;
import java.util.Stack;
//import java.lang.*;
public class EvaluateString extends MainActivity{
    public static float evaluate(String expression)
    {
        //MainActivity m = new MainActivity();
        char[] tokens = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Float> values = new Stack<Float>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++)
        {
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers
            if ((tokens[i] >= '0' && tokens[i] <= '9')||(tokens[i]=='.'))
            {
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (i < tokens.length && ((tokens[i] >= '0' && tokens[i] <= '9')||tokens[i]=='.'))
                    sbuf.append(tokens[i++]);
                float val = Float.parseFloat(sbuf.toString());
                values.push(val);
            }

            // Current token is an opening brace, push it to 'ops'
            else if (tokens[i] == '(')
                ops.push(tokens[i]);

                // Closing brace encountered, solve entire brace
            else if (tokens[i] == ')')
            {

                if(ops.isEmpty()){
                     f=0;
                     output.setText("incomplete expression, click on 'clear'");
                     return 0;
                }
                else {
                    while (ops.peek() != '(') {
                        if(ops.isEmpty()){
                            f=0;
                            output.setText("incomplete expression, click on 'clear'");
                            return 0;
                        }
                        else if(values.size()<2){
                            f=0;
                            output.setText("incomplete expression, click on 'clear'");
                            return 0;

                        }
                        else
                        values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                    }
                    if(ops.isEmpty()){
                        f=0;
                        output.setText("incomplete expression, click on 'clear'");
                        return 0;
                    }
                    else
                    ops.pop();
                }
            }

            // Current token is an operator.
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/')
            {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    if(values.size()<2){
                        f=0;
                        output.setText("incomplete expression, click on 'clear'");
                        return 0;

                    }
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty()) {
            if(values.size()<2){
                f=0;
                output.setText("incomplete expression, click on 'clear'");
                return 0;
            }
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        // Top of 'values' contains result, return it
        if(values.isEmpty()){
            f=0;
            output.setText("incomplete expression, click on 'clear'");
            return 0;
            //values.push((float) 0);
        }
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static float applyOp(char op, float b, float a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                return (float)a / b;

        }
        return 0;
    }
}
