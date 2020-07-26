package com.jingchu.jdk8;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

/**
 * @description: 数组引用
 * @author: JingChu
 * @createtime :2020-07-26 18:14:01
 **/
public class ArraysQoute {
    @Test
    public void test() {
        //未使用数组引用
        Function<Integer, String[]> function = (x) -> new String[x];

        //使用数组引用
        Function<Integer, String[]> function1 = (x) -> new String[x];


        String[] strings = function.apply(10);
        System.out.println(strings.length);
        String[] strings1 = function.apply(20);
        System.out.println(strings1.length);


    }
}
