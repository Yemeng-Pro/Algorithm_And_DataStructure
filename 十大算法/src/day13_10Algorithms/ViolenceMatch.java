package day13_10Algorithms;

/**
 * @author Yemeng
 * @create 2021-01-06-20:41
 */
public class ViolenceMatch {

    public static void main(String[] args) {
        String str1 = "硅硅谷尚硅谷你尚硅尚硅谷你尚硅谷你尚硅你好";
        String str2 = "尚硅谷你尚硅你";
        int index = violenceMatch(str1, str2);
        System.out.println("index=" + index);
    }

    public static int violenceMatch(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1Len = s1.length;
        int s2Len = s2.length;
        int i = 0; // i 索引指向s1
        int j = 0; // j 索引指向s2

        while (i < s1Len && j < s2Len) {// 保证匹配时，不越界
            if(s1[i] == s2[j]) {//匹配ok
                i++;
                j++;
            } else { //没有匹配成功
            //如果失配（即str1[i]! = str2[j]），令i = i - (j - 1)，j = 0。
                i = i - (j - 1);
                j = 0;
            }
        }
        //判断是否匹配成功
        if(j == s2Len) {
            return i - j;
        } else {
            return -1;
        }
    }
}
