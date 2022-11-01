package com.kl.enjoy;

import com.kl.enjoy.entity.TestOne;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class swingFun {

    public static void main(String[] args) {
        System.out.println();
    }

    public int compare(int a, Function<Integer,Integer> function,Function<Integer,Integer> integerFunction){
        return function.compose(integerFunction).apply(a);
    }

    public List<TestOne> gettestByage(String age,List<TestOne> testOnes){
        BiFunction<String,List<TestOne>,List<TestOne>> biFunction=(ageser,list) -> list.stream().filter(testOne -> testOne.getAge().equals(ageser)).collect(Collectors.toList());
        return biFunction.apply(age,testOnes);
    }

}
