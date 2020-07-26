package com.jingchu.jdk8;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @description: 构造器方法引用测试实例
 * @author: JingChu
 * @createtime :2020-07-26 17:55:34
 **/
public class ConstructorQoute {
    @Test
    public void test(){
        //未使用构造器方法引用
        Supplier<String> supplier = ()->new String();



        //使用构造器方法引用
        Supplier<String> supplier1 = String::new;
        System.out.println("使用lambda表达式（）->形式:" + supplier.get());
        System.out.println("使用引用方法，构造器方法:" + supplier1.get());
    }
    @Test
    public void test1(){
        //未使用构造器方法引用
        Function<String,String> function = (x)->new String(x);



        //使用构造器方法引用
        Function<String,String>  function1 = String::new;

        System.out.println("使用lambda表达式（）->形式:" + function.apply("JingChu 努力学习"));
        System.out.println("使用引用方法，构造器方法:" + function1.apply("JingChu 努力学习"));
    }
}
