class Solution {
    public int reverse(int x) {

        String str1 = Integer.toString(x); 
        boolean neg=false;
        if(x<0)
        neg=true;
        String res="";
        int num;

     

        if(!neg){
            for(int i=str1.length()-1;i>=0;i--)
        {
            res+=str1.charAt(i);
        }
        }
        else
        {
           for(int i=str1.length()-1;i>0;i--)
        {
            res+=str1.charAt(i);
        } 
        }
        
      
    try {
    // Check if the number should be negative
    if (neg) {
        num = Integer.parseInt("-" + res);
    } else {
        num = Integer.parseInt(res);
    }
} catch (NumberFormatException e) {
    // Handle the exception by returning 0
    return 0;
}

    //  if (num > (Math.pow(2, 31) - 1) || num < -Math.pow(2, 31)) 

    //     {
    //         return 0;
    //     }
       return num;

    }
}