package ArraysProblems;

public class replaceElementswithGreatesElementOnRightSide {

    public int[] ReplaceElements(int[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;

        int currMax = -1;

        for (int i = arr.length - 1; i >= 0; i--)
        {
            int oriNum = arr[i];
            arr[i] = currMax;
            currMax = Math.max(currMax, oriNum);
        }

        return arr;


    }

    public int[] ReplaceElementsSolution2(int[] arr)
    {
        if (arr == null || arr.length == 0)
            return arr;
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--)
        {
            int cur = arr[i];
            arr[i] = max;

            if (cur > max)
            {
                max = cur;
            }
        }

        return arr;
    }
}
