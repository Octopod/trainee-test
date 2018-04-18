import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int recursiveStairCounter(int steps){
        int returnValue = 0;

        if (steps < 0)
            return 0;
        if (steps == 0)
            return 1;

        returnValue = recursiveStairCounter(steps-1);
        returnValue += recursiveStairCounter(steps-2);
        returnValue += recursiveStairCounter(steps-3);
        return returnValue;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nrOfStairs = in.nextInt();
        int nrOfWays=0;
        int[] listOfStairs = new int[nrOfStairs];
        for(int a0 = 0; a0 < nrOfStairs; a0++){
            int n = in.nextInt();
            listOfStairs[a0] = recursiveStairCounter(n);
            //nrOfWays += recursiveStairCounter(n);
        }
        for (int stair:listOfStairs) {
            System.out.println(stair);
        }

    }
}