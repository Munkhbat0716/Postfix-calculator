import java.util.Stack;

public class Postfix 
{
    String expr;
    Stack<Double> stack;
    
    public Postfix(String e)
    {
       expr = e;
       stack = new Stack<Double>();
    }
    
    public double eval()
    {
        String[] tokens = expr.split(" ");
        
        for(String token : tokens)// shortcut when you dont need an index
        {
          if(token.equals("+"))
          {
              double a = stack.pop();
              double b = stack.pop();
              stack.push(a+b);
          }
          else if(token.equals("-"))
          {
             double a = stack.pop();
             double b = stack.pop();
             stack.push(b-a);
          }
          else if(token.equals("*"))
          {
            double a = stack.pop();
            double b = stack.pop();
            stack.push(b*a);
          }
          else if(token.equals("/"))
          {
             double a = stack.pop();
             double b = stack.pop();
             stack.push(b/a);
          }
          else if(token.equals("^"))
          {
            double a = stack.pop();
            double b = stack.pop();
            stack.push(Math.pow(b, a));
          }
          else if(token.equals("sqrt"))
          {
              double a = stack.pop();
              stack.push(Math.sqrt(a));
          }
          else if(token.equals("dup"))
          {
              double a = stack.pop();
              stack.push(a);
              stack.push(a);
          }
          else if(token.equals("swap"))
          {
              double a = stack.pop();
              double b = stack.pop();
              stack.push(a);
              stack.push(b);
          }
          else if(token.equals("rot"))
          {
              double a = stack.pop();
              double b = stack.pop();
              double c = stack.pop();
              stack.push(b);
              stack.push(c);
              stack.push(a);
          }
          else if(token.equals("tan"))
          {
              double a = stack.pop();
              stack.push(Math.tan(a));
          }
          else if(token.equals("sin"))
          {
              double a = stack.pop();
              stack.push(Math.sin(a));
          }
          else if(token.equals("cos"))
          {
              double a = stack.pop();
              stack.push(Math.cos(a));
          }
          else if(token.equals("smoot"))
          {
              double a = stack.pop();
              stack.push(a/(5+7.0/12.0));
          }
          else if(token.equals("mod"))
          {
              double a = stack.pop();
              double b = stack.pop();
              stack.push(b%a);
          }
          else
          {
            //must be a number
            try
            {
              double n = Double.parseDouble(token);
              stack.push(n);
            }
            catch(java.lang.NumberFormatException nfe)
            {
                throw new UnknownToken();
            }
          }
        }
        return stack.peek();
    }
}

