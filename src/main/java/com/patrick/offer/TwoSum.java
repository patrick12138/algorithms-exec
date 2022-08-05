package com.patrick.offer;

import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int num : nums) {
            int result = target - num;
            if (map.containsKey(result)) {
                return new int[]{num, result};
            }
        }
        Collection<Integer> values = map.values();
//        for (int i = 0; i < nums.length; i++) {
//            int result = target - nums[i];
//            map.put(nums[i], result);
//            if (map.containsKey(result) && map.get(i) != result) {
//                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//                    if (entry.getKey() == result && entry.getKey() != entry.getValue()) {
//                        return new int[]{entry.getKey(), entry.getValue()};
//                    }
//                }
//            }
//        }
//                        map.forEach((key,val)-> System.out.println(key+"->"+val));
        return null;
    }

    /**
     * 捏麻麻用set就行
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(target - num)) set.add(num);
            else return new int[]{num, target - num};
        }
        return new int[]{};
    }

    /**
     * 碰撞双指针
     * 空间 O1
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int s = nums[i] + nums[j];
            if (s < target) i++;
            else if (s > target) j--;
            else return new int[]{nums[i], nums[j]};
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {13, 14, 19, 21, 25, 39, 42, 50, 51, 67, 75, 79, 97, 97,
                104, 129, 134, 146, 160, 166, 166, 168, 174, 179, 194, 208,
                222, 235, 241, 257, 262, 282, 284, 287, 293, 298, 302, 315,
                316, 331, 350, 362, 372, 372, 377, 387, 399, 410, 433, 474,
                481, 483, 484, 500, 509, 544, 557, 563, 571, 575, 586, 621,
                624, 630, 644, 654, 659, 689, 714, 730, 762, 763, 764, 774,
                779, 802, 804, 810, 822, 825, 829, 841, 842, 857, 875, 902,
                907, 920, 922, 925, 927, 931, 936, 967, 969, 970, 973, 979, 980, 989, 962};
//        for (int i : ) {
//            System.out.println(i);
//        }
        twoSum(nums, 962);
//        System.out.println(twoSum(nums, 65));
    }
}
