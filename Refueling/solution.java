// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] X) {
        // write your code in Java SE 8
        int totalDistance = 0;
        int totalFuel = 0;
        int arrSize = A.length;
        int counter = 1;
        int it = 0;

        while (true) {
            totalFuel = 0;
            totalDistance = Math.abs(X[it] - X[it+arrSize-1]);
            for (int n = it; n < it+arrSize-1; n++) {
                totalFuel += A[n];
            }

            if (totalFuel >= totalDistance) {
                return arrSize;
            } 

            it++;
            if (it >= counter) {
                arrSize--;
                it = 0;
                counter++;
            }
        }
    }
}