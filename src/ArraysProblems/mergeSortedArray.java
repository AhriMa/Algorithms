package ArraysProblems;

public class mergeSortedArray {
    public void Merge(int[] nums1, int m, int[] nums2, int n)
    {
        int pointer1 = m - 1;
        int pointer2 = n - 1;


        for (int pointerRight = m + n - 1; pointerRight >= 0; pointerRight--)
        {
            if (n != 0 && m != 0)
            {

                if (nums1[pointer1] > nums2[pointer2])
                {
                    nums1[pointerRight] = nums1[pointer1];
                    pointer1--;
                    m--;
                }
                else
                {
                    nums1[pointerRight] = nums2[pointer2];
                    pointer2--;
                    n--;
                }

            }
            else if (m == 0)
            {
                for (int i = 0; i <= n - 1; i++)
                    nums1[i] = nums2[i];
            }
            else if (n == 0)
            { break; }
        }

    }

    // while loop
    public void Merge2(int[] nums1, int m, int[] nums2, int n)
    {
        int pointer1 = m - 1;
        int pointer2 = n - 1;

        int pointerRight = m + n - 1;
        // for ( pointerRight >= 0; pointerRight--)

        while (n != 0 && m != 0 && pointerRight >= 0)
        {

            if (nums1[pointer1] > nums2[pointer2])
            {
                nums1[pointerRight] = nums1[pointer1];
                pointer1--;
                m--;
                pointerRight--;
            }
            else
            {
                nums1[pointerRight] = nums2[pointer2];
                pointer2--;
                n--;
                pointerRight--;
            }

        }
        if (m == 0)
        {
            for (int i = 0; i <= n - 1; i++)
                nums1[i] = nums2[i];
        }

    }
}
