package ArraysProblems;

public class removeElement {
    public int RemoveElement(int[] nums, int val)
    {
        if (nums.length == 0) return 0;
        int left = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            { nums[left] = nums[i];
                left++;
            }
        }
        return left;
    }

    //swap the val element with the last element and delete the last one
    //考虑如果right 值为val 的情况， 所以用while+ ifelse 而不是单纯的for循环 递增
    //考虑极端值 [1] 1， i和right 都等于0的时候，用小于等于 <=
    public int RemoveElementSwap(int[] nums, int val)
    {
        if (nums.length == 0) return 0;
        int right = nums.length-1;
        int i = 0;
        while (i<=right)
        {
            if (nums[i] == val)
            {
                nums[i] = nums[right];
                right--;

            }
            else
                i++;
        }
        return right +1;
    }
}
