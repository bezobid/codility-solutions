package prefix_sums;

/*Write a function:

class Solution { public int solution(int A, int B, int K); }
that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

        { i : A ≤ i ≤ B, i mod K = 0 }
        For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

        Assume that:

        A and B are integers within the range [0..2,000,000,000];
        K is an integer within the range [1..2,000,000,000];
        A ≤ B.
        Complexity:

        expected worst-case time complexity is O(1);
        expected worst-case space complexity is O(1).*/

public class CountDiv {

    public static void main(String[] args) {
        solution(8, 19, 4);
        solution(0,0, 2);
        solution(0, 1, 1);
        solution(3, 3, 3);
        solution(1, Integer.MAX_VALUE, 13);
        solution(0, Integer.MAX_VALUE, Integer.MAX_VALUE);

    }

    public static int solution(int A, int B, int K){
        System.out.printf("A = %d\nB = %d\nK = %d\n", A, B, K);

        int result = B/K - A/K + (A % K == 0 ? 1 : 0);

        System.out.println("Result: " + result + "\n");

        return result;
    }

    // zero is divisible by any non-zero number !!!
}
