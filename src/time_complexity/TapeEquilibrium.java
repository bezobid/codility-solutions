package time_complexity;

import java.util.Arrays;

/*A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.

        Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].

        The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|

        In other words, it is the absolute difference between the sum of the first part and the sum of the second part.

        For example, consider array A such that:

        A[0] = 3
        A[1] = 1
        A[2] = 2
        A[3] = 4
        A[4] = 3
        We can split this tape in four places:

        P = 1, difference = |3 − 10| = 7
        P = 2, difference = |4 − 9| = 5
        P = 3, difference = |6 − 7| = 1
        P = 4, difference = |10 − 3| = 7
        Write a function:

class Solution { public int solution(int[] A); }
that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.

        For example, given:

        A[0] = 3
        A[1] = 1
        A[2] = 2
        A[3] = 4
        A[4] = 3
        the function should return 1, as explained above.

        Assume that:

        N is an integer within the range [2..100,000];
        each element of array A is an integer within the range [−1,000..1,000].
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
        Elements of input arrays can be modified.*/

public class TapeEquilibrium {

    public static void main(String[] args) {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

        int[] array1 = {2, -4, 9, -5, -3, 4};
        int[] array4 = {1, 1};
        int[] array5 = {3, 1, 2, 4, 3};
        int[] array6 = {1, 2000};

        tapeEquilibrium.solution(array1);
        tapeEquilibrium.solution(array4);
        tapeEquilibrium.solution(array5);
        tapeEquilibrium.solution(array6);

    }

    int solution(int A[]) {

        System.out.println(Arrays.toString(A));

        int right = 0;
        for (int i : A) {
            right += i;
        }

        int left = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < A.length - 1; i++) {
            left += A[i];
            System.out.print(left + " | ");

            right -= A[i];
            System.out.print(right);

            int diff = Math.abs(right - left);
            if (diff < minDiff) {
                minDiff = diff;
            }

            System.out.println("\t\tdiff: " + diff + "\tmin: " + minDiff);
        }

        System.out.println("minDiff: " + minDiff + "\n");
        return minDiff;
    }
}
