package ArraysProblems;

import java.util.Arrays;

public class squareofASortedArray {

    public int[] SortedSquares(int[] A)
    {
        int len = A.length;
        int[] res = new int[len];
        for (int i = 0; i < A.length; i++) {
            res[i] = A[i] * A[i];
        }
        Arrays.sort(res);
        return res;


    }

    public int[] SortedSquaresTwoPointers(int[] A)
    {
        int left = 0;
        int len = A.length;
        int right = len - 1;
        var Res = new int[len];
        for (int i = len - 1; i >= 0; i--)
        {
            var ls = (A[left])*(A[left]);
            var rs = (A[right]) * (A[right]);
            if (ls > rs)
            {
                Res[i] = ls;
                left++;
            }
            else
            {
                Res[i] = rs;
                right--;
            }
        }
        return Res;
    }
}
