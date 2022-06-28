// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String bin = Integer.toBinaryString(N);
        int biggest = 0;
        int current = 0;

        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0') {
                current++;
            } else if (bin.charAt(i) == '1') {
                if (current > biggest) {
                    biggest = current;
                }
                current = 0;
            }
        }
        return biggest;
    }
}