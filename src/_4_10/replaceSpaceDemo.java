package _4_10;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 剑指 Offer 05. 替换空格
 * @Date 2021/4/10 下午 20:13
 */

//请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
public class replaceSpaceDemo
{
    public String replaceSpace(String s)
    {
        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == ' ')
            {
                stringBuilder.append("%20");
            } else
            {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
