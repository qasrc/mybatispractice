package com.learn.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhan
 * Created on 2017/11/05  20:26
 */
public class PatternUtil {
    private static final Pattern PATTERN = Pattern.compile("^[A-Z].*.$");

    public static boolean isMatch(String matchStr) {

        Matcher matcher = PATTERN.matcher(matchStr);
        return matcher.matches();
    }

}
