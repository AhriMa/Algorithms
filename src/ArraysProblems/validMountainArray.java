package ArraysProblems;

public class validMountainArray {

    //注意edging conditicon， 当peak_index==0 or peak_index==len-1， 即全增全减 的array 也不是mountain array
    public boolean  ValidMountainArray(int[] A)
    {
        if (A.length < 3)
            return false;
        else
        {
            int peak = 0;
            int peak_index = 0;
            for (int i = 0; i < A.length; i++)
            {
                if (A[i] > peak)
                {
                    peak = A[i];
                    peak_index = i;
                }

            }
            if (peak_index == 0 || peak_index == A.length - 1)
            {
                return false;
            }

            for (int index=0; index < peak_index;index++)
            {
                if (A[index] < A[index + 1])
                {
                }
                else
                {
                    return false;
                }
            }

            for (int index = peak_index; index < A.length - 1; index++)
            {
                if (A[index] > A[index + 1])
                { }
                else
                {
                    return false;
                }
            }

            return true;

        }
    }
    // walk up and walk down to go through the entire array
    public boolean ValidMountainArraySolution2(int[] A)
    {
        int len = A.length;
        int i = 0;
        while (i + 1 < len && A[i] < A[i + 1])
        { i++; }
        if (i == len - 1 || i == 0)
            return false;
        while (i + 1 < len && A[i] > A[i + 1])
        { i++; }
        return i == len - 1;
    }
}
