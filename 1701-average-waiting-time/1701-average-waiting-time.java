class Solution {
    public double averageWaitingTime(int[][] customers) {
        double waitingTime = 0;
        int finishTime = customers[0][0];
        int arrivalTime;
        int timeTaken;
        int startTime;


        for (int[] temp : customers) {
             arrivalTime = temp[0];
             timeTaken = temp[1];
            if (finishTime > arrivalTime) {
                 startTime = finishTime;
            }else {
                startTime = arrivalTime;
            }

            finishTime = startTime + timeTaken;

            System.out.println("arrivalTime: " + arrivalTime);
            System.out.println("finishTime: " + finishTime);
            System.out.println("waitingTime: " + (finishTime - arrivalTime));
            waitingTime += (finishTime - arrivalTime);

        }
        return waitingTime / customers.length;

    }
}