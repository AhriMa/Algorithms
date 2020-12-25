package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stickstoPolygon {

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    // form Regular polygon
    static boolean formPolygon(int[] sticks, int sides)
    {
        if(sticks==null || sticks.length<sides)
            return false ;
        int sum=0;
        for(int i=0 ; i<sticks.length; i++)
        {
            sum = sum+sticks[i];
        }

        int target = sum/sides;
        if( sum%sides != 0)
            return false;
        //        for(int i=0; i<sticks.length; i++)
        //        {
        //            if (sticks[i] > target)
        //                return false;
        //        }
        Arrays.sort(sticks);

        int[] eachSide = new int[sides];
        for(int i =0; i < eachSide.length; i++)
        {
            eachSide[i] = target;
        }
        return helper(sticks, 0, eachSide );



    }

    // 子问题： 能不能找到sticks 让每一条边分别满足 和是 target。 在 index 为 0 - sticks.length 范围里面找
    private static boolean helper(int[] sticks, int index, int[] target)
    {
        // if subset sums equal to target, then remove them from sticks[]

        //target[10,10,10,10] => target[0,0,0,0]
        // 最后一层子问题
        if(index  == sticks.length)
        {
            for(int i=0; i < target.length; i++)
            {
                if(target[i]!= 0)
                {
                    return false;
                }
            }
            return true;
        }
        // 当target[i] -sticks[index] <0, false
        //解决每一个子问题， 讨论子问题的可能性: 棍子加在哪一条边上？
        // 0 5 10 10
        for(int i=0; i< target.length; i++)
        {
            //1.
            if(target[i] >= sticks[index])
            {
                target[i] = target[i] - sticks[index];
                if(helper(sticks, index+1, target)==true)   //1,1,1,1,2,2,2,2     4
                {
                    return true;
                };
                target[i] = target[i] + sticks[index];
            }
        }
        return false;


    }
    /******************************结束写代码******************************/

    public static List<Integer> extractNumList(String arr) {
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(arr);
        List<Integer> res = new ArrayList<>();
        while (matcher.find()) {
            res.add(Integer.parseInt(matcher.group()));
        }
        return res;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String arr = in.nextLine().trim();
        List<Integer> array = extractNumList(arr);
        int[] sticks = array.stream().mapToInt(Integer::valueOf).toArray();
        int sides = Integer.parseInt(in.nextLine().trim());

        boolean res = formPolygon(sticks, sides);
        System.out.println(res ? "true" : "false");
    }
}
