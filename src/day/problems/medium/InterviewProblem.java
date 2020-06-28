package day.problems.medium;

/**
 * @description:
 * @author: CJN
 * @time: 2020/6/22 下午12:19
 * @Description:
 * @Modified By:
 */
public class InterviewProblem {
    public boolean patternMatching(String pattern, String value) {
        /**
         * @Description: 面试题 16.18. 模式匹配
         * aba -> dogcatdog == true
         * abc -> dogcatcat == false
         * @param pattern 模式字符串
         * @param value 匹配字符串
         * @return: boolean
         * @time: 2020/6/22 下午12:23
         */
        // 特殊情况
        if ("".equals(pattern) && "".equals(value)) {
            return true;
        }
        if (pattern == null || value == null) {
            return false;
        }
        // m, n分别记录a,b的个数, l表示value的长度，保证mx + ny == l
        int m = 0;
        int n = 0;
        int l = value.length();
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') {
                m += 1;
            } else {
                n += 1;
            }
        }

        // 因为 1 <= x <= (l - n) / m
        int max = m == 0 ? 0 : l / m;
        for (int i = 0; i <= max; i++) {
            int j = n == 0 ? 0 : (l - i * m) / n;
            if (j * n + i * m == l) {
                int aIndex = pattern.indexOf('a');
                int bIndex = pattern.indexOf('b');
                String a = aIndex == -1 ? "" : value.substring(j * aIndex, j * aIndex + i);
                String b = bIndex == -1 ? "" : value.substring(i * bIndex, i * bIndex + j);
                if (a.equals(b)) {
                    continue;
                }
                int valueIndex = 0;
                for (int k = 0; k < pattern.length(); k++) {
                    if (pattern.charAt(k) == 'a') {
                        if (a.equals(value.substring(valueIndex, valueIndex + i))) {
                            valueIndex = valueIndex + i;
                        } else {
                            break;
                        }
                    } else {
                        if (b.equals(value.substring(valueIndex, valueIndex + j))) {
                            valueIndex = valueIndex + j;
                        } else {
                            break;
                        }
                    }
                }
                if (valueIndex == value.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
