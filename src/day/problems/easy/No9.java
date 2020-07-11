package day.problems.easy;

/**
 * @Name: No9
 * @Author: CJN
 * @Date: 2020/7/5 16:46
 * @Description: //TODO
 * @Modified By:
 */
public class No9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverseX = 0;
        int temp = x;
        while (temp > 0) {
            reverseX = reverseX * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverseX == x;
    }
}
