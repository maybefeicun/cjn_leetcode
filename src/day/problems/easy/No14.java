package day.problems.easy;

/**
 * @Name: No14
 * @Author: CJN
 * @Date: 2020/7/5 16:57
 * @Description: //TODO
 * @Modified By:
 */
public class No14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String tempStr = strs[0];
        for (String str : strs) {
            tempStr = tempStr.length() > str.length() ? str : tempStr;
        }
        boolean flag = false;
        for (int i = tempStr.length(); i >= 0; i--) {
            String temp = tempStr.substring(0, i);
            for (String str : strs) {
                if (!temp.equals(str.substring(0, i))) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag) {
                return temp;
            }
        }
        return "";
    }
}
