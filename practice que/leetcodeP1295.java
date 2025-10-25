public class leetcodeP1295 {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
        System.out.println(findNumber(num)); // expected output: 2
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digit(num);
        return numberOfDigits % 2 == 0;
    }

    static int digit(int num) {
        if (num == 0) return 1; // special case for 0
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
