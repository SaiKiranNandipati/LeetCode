class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int num_empty = numBottles % numExchange;
        int quotient = numBottles / numExchange;
        int res = numBottles;

        num_empty=num_empty+quotient;

        while(num_empty>=numExchange)
        {
            // System.out.println("quotient; " + quotient);
            // System.out.println("num_empty: " + num_empty);
            res+=quotient;
            
            quotient=num_empty/numExchange;
            // num_empty=num_empty+quotient;
            num_empty=(num_empty%numExchange)+quotient;
        }


        return res+quotient;

    }
}

