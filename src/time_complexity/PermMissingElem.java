package time_complexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

        Your goal is to find that missing element.

        Write a function:

class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element.

        For example, given array A such that:

        A[0] = 2
        A[1] = 3
        A[2] = 1
        A[3] = 5
        the function should return 4, as it is the missing element.

        Assume that:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
        Elements of input arrays can be modified.
*/

public class PermMissingElem {

    public static void main(String[] args) {

        List<int[]> list = new ArrayList<>();

        list.add(new int[0]);
        list.add(new int[]{1});
        list.add(new int[]{2, 3, 4});
        list.add(new int[]{2, 1, 3});
        list.add(new int[]{2, 3, 5, 1});

        for (int[] array : list) {
            System.out.println("\n" + solution(array) + " is missing");
        }
    }

    public static int solution(int[] A) {

        System.out.println("==================================");
        System.out.println(Arrays.toString(A) + " unsorted");

        Arrays.sort(A);

        System.out.println(Arrays.toString(A) + " sorted\n");

        for (int i = 0; i < A.length; i++) {
            int num = i + 1;
            System.out.println(String.format("i=%d\tnum=%d\tA[i]=%d", i, num, A[i]));
            if (A[i] != num) {
                return num;
            }
        }
        return A.length + 1;
    }
}

