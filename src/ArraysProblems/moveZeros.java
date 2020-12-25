package ArraysProblems;

public class moveZeros {

    public void MoveZeroes(int[] nums)
    {
        int zeroCount = 0;
        int[] Zero = { 0 };
        if (nums.length > 1)
        {

            for (int i = nums.length - 1; i >= 0; i--)
            {
                if (nums[i] == 0)
                {
                    for (int j = i; j < nums.length - 1; j++)
                    {
                        nums[j] = nums[j + 1];
                    }

                    nums[nums.length - 1 - zeroCount] = 0;
                    zeroCount++;
                }
            }


        }
    }


    //two pointers, 一个快一个慢， 慢的只包含non-zero 数字；
    public void MoveZeroesTwoPointers(int[] nums)
    {
        int len = nums.length;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++)
        {
            if (nums[fast] != 0)
            {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
            }
            if (nums[slow] != 0)
            { slow++; }
        }
    }
}
