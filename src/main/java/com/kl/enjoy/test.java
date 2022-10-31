package com.kl.enjoy;

import java.util.Arrays;

public class test {

    public int magicalString(int n) {
        if(n <= 2)return 1;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = arr[2] = 2;

        int i = 3, j = 3, ret = 1; //i代表神奇字符串被考察到第几位了; j代表神奇数字被生成到第几位了
        while(i <= n){
            int x = arr[i++ - 1]; //神奇字符串的第i个数字
            if(x == 1)ret++;
            int l = arr[j - 1]; //第i-1个数对应的分组片段的最后一个字符
            while(j < n && x-- > 0) arr[j++] = 3 ^ l;//只生成前n位，超出部分不再需要被考察。3^l, 会让l的值1变2,2变1。注意2后面只能是11或者1, 1后面只能是22或者2。
        }
        return ret;
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        test test = new test();
        //int i = test.magicalString(10);
        int[] a=new int[]{2,7,11,15};
        int[] ints = test.twoSum(a, 9);
        System.out.println();
    }
}
