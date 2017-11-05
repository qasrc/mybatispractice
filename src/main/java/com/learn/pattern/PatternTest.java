package com.learn.pattern;

import org.junit.Test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author zhan
 * Created on 2017/11/05  9:38
 */
public class PatternTest {
    public static void main(String[] args) {
        System.out.println("123123".matches("-?\\d+"));
    }
    //kjijlkjio

    @Test
    public void est() {
        testPattern(" ");
        testPattern("\\W");
        testPattern("n\\W");

    }

    String str = "hello world,start... learn... pattern.";

    private void testPattern(String pattern) {
        System.out.println(Arrays.toString(str.split(pattern)));
    }

    @Test
    public void test1() {
        String s = "hello world, my name is zhangzhan.";
        String s1 = "Hello world, my name is zhangzhan.";
        System.out.println(PatternUtil.isMatch(s1));
    }

    @Test
    public void test2() {
        String s = "hello world the weather is the good;";
        String[] ss = s.split("\\s+[the[is]]\\s+");
        System.out.println(Arrays.toString(ss));
    }

    @Test
    public void test3() {
        String s = "abcabcabc";
        Pattern pattern = Pattern.compile("abc+");
        Matcher matcher = pattern.matcher("s");
        System.out.println(matcher.end());

    }
}
