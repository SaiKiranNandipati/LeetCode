class Solution {
    public String reverseParentheses(String s) {

        Stack <Character> stack= new Stack <Character> ();

        // String result="";
        String res="";

        for (int i=0;i<s.length();i++)
        {
            Character c=s.charAt(i);
            if(c==')')
            {
                res="";
                while(stack.peek()!='(')
                {
                    res+=stack.pop(); //evol
                }
                stack.pop();


                for(int j=0;j<=res.length()-1;j++)
                {
                    stack.push(res.charAt(j));
                }

            }
            else
            {
                stack.push(c);
            }
        }
    if(stack.isEmpty()==false)
    {
        res=""; 
       while(stack.isEmpty()==false)
        {     
            res+=stack.pop(); //evol
                // stack.pop();


              
        }
          for(int j=0;j<=res.length()-1;j++)
                {
                    stack.push(res.charAt(j));
                }
    }
    
        String result="";

        System.out.println("res: "+res);

    for (int i=0; i<res.length(); i++)
      {
        Character ch= res.charAt(i); //extracts each character
        result= ch+result; //adds each character in front of the existing string
      }

        return result;
        
    }
}

// abcd
// dcba
//(u(love)i)
// i love u 
// u(love->stack
// evol->res
// ui->stack
// evoli->res
// ilove->res.rev
// ilove+u

// ed(et(oc))el) 
// co

// le
// co-res
// ed(et)
// etoc
// cote
// ed+octe+el