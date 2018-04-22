package se.denisen;

import java.util.Scanner;

class Solution {
    private static int stairCounter(int steps){
        int[] returnValueCounter = new int[steps];

        if (steps < 1)
            return 0;
        if (steps == 1)
            return 1;
        if (steps == 2)
            return 2;
        if (steps == 3)
            return 4;

        returnValueCounter[0] = 1;
        returnValueCounter[1] = 2;
        returnValueCounter[2] = 4;

        int i = 3;
        while (i < steps) {
            returnValueCounter[i] = returnValueCounter[i-3] + returnValueCounter[i-2] + returnValueCounter[i-1];
            i++;
        }
        return returnValueCounter[steps-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfStairs = in.nextInt();
        int[] listOfStairs = new int[nrOfStairs];
        for(int a0 = 0; a0 < nrOfStairs; a0++){
            int n = in.nextInt();
            listOfStairs[a0] = stairCounter(n);
        }
        for (int stair:listOfStairs) {
            System.out.println(stair);
        }
    }
}