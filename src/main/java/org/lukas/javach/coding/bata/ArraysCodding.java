package org.lukas.javach.coding.bata;

import java.util.Arrays;

/**
 * Created by Lukas on 01.06.2018.
 *
 * @author Lukas Pecak
 */
class ArraysCodding {

    private static final String INPUT_ARRAY_CANNOT_BE_NULL = "Input array cannot be null";

    int[] zeroFront(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException(INPUT_ARRAY_CANNOT_BE_NULL);
        }
        if (nums.length <= 1) {
            return nums;
        }
        int[] out = new int[nums.length];
        int outIndex = out.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                out[outIndex--] = nums[i];
            }
        }
        return out;
    }

    int[] withoutTen(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException(INPUT_ARRAY_CANNOT_BE_NULL);
        }
        int[] output = new int[nums.length];
        int outputIndex = 0;
        for (int num : nums) {
            if (num != 10) {
                output[outputIndex++] = num;
            }
        }
        return output;
    }

    int[] zeroMax(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException(INPUT_ARRAY_CANNOT_BE_NULL);
        }
        int[] output = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                output[i] = calculateOddNumber(Arrays.copyOfRange(nums, i + 1, nums.length));
            }
        }
        return output;
    }

    private int calculateOddNumber(int[] subNums) {
        int output = 0;
        for (int num : subNums) {
            if (num % 2 == 1 && num > output) {
                output = num;
            }
        }
        return output;
    }

    int[] evenOdd(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException(INPUT_ARRAY_CANNOT_BE_NULL);
        }
        int[] output = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                output[evenIndex++] = num;
            } else {
                output[oddIndex--] = num;
            }
        }
        return output;
    }

    String[] fizzBuzz(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("Wrong input arguments. Start need to be smaller than end");
        }
        String[] output = new String[end - start];
        int currentValue = start;
        for (int i = 0; i < output.length; i++) {
            output[i] = fizzBuzzConverter(currentValue++);
        }
        return output;
    }

    private String fizzBuzzConverter(int num) {
        if (num % 3 != 0 && num % 5 != 0) {
            return String.valueOf(num);
        }
        String output = "";
        if (num % 3 == 0) {
            output += "Fizz";
        }
        if (num % 5 == 0) {
            output += "Buzz";
        }
        return output;
    }


}
