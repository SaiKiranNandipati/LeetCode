class Solution {
    String s;
    public int getScore(String s, String subString)
    {
        int score=0;
        Stack <Character> myStack = new Stack();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==subString.charAt(1) && (myStack.isEmpty()==false)&& myStack.peek()==subString.charAt(0))
            {
                score++;
                myStack.pop();
            }
            else
            {
                myStack.push(s.charAt(i));
            }

            
        }
        // this.s=String.join("", myStack);
        StringBuilder sb = new StringBuilder();
        for (Character ch : myStack) {
            sb.append(ch);
        }

        this.s=sb.toString();


        return score;
    }


    public int maximumGain(String s, int x, int y) {
        this.s=s;
        int res=0;
        if(x>y)
        {
       
        res= getScore(this.s,"ab")*x;
        res+=getScore(this.s,"ba")*y;
        }
        else
        {
        res= getScore(this.s,"ba")*y;
       
        res+=getScore(this.s,"ab")*x;

        }
        return res;
    }
}