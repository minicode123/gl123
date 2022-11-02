package com.kl.enjoy;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class test {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("-----");
        List<String> list= Arrays.asList(args);
        System.out.println(list.size());
    }
}
