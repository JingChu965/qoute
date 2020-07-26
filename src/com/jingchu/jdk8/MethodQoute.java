package com.jingchu.jdk8;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * @description: 方法引用测试实例
 * @author: JingChu
 * @createtime :2020-07-26 16:35:37
 **/
public class MethodQoute {
    /**
     * 对象::实例方法
     * 类::静态方法
     * 类::实例方法
     */

    //对象::实例方法
    @Test
    public void test() {
        //未使用对象::实例方法引用
        Consumer<String> consumer = (x) -> System.out.println(x);

        //使用对象::实例方法引用
        PrintStream printStream = System.out;
        Consumer<String> consumer1 = printStream::println;

        consumer.accept("使用lambda表达式（）->形式");
        consumer1.accept("使用引用方法，对象的实例方法");

    }

    //类::静态方法
    @Test
    public void test1() {
        //未使用类::静态方法引用
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);

        //使用类::静态方法引用
        Comparator<Integer> comparator1 = Integer::compare;


        TreeSet<Integer> treeSet = new TreeSet<>(comparator);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(2);

        TreeSet<Integer> treeSet1 = new TreeSet<>(comparator1);
        treeSet1.add(1);
        treeSet1.add(4);
        treeSet1.add(2);
        System.out.println("使用lambda表达式（）->形式:" + treeSet.toString());
        System.out.println("使用引用方法，类的静态方法:" + treeSet1.toString());

    }

    //类::实例方法
    @Test
    public void test2() {
        //未使用类::实例方法引用
        BiPredicate<String, String> biPredicate = (x, y) -> x.equals(y);

        //使用类::实例方法引用
        BiPredicate<String, String> biPredicate2 = String::equals;

        System.out.println("使用lambda表达式（）->形式:" + biPredicate.test("hellow", "hellow1"));
        System.out.println("使用引用方法，类的实例方法:" + biPredicate.test("hellow", "hellow1"));
    }
}
