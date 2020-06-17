package com.example.datatype;

public class DataType {

    public static void main(String[] args) {
//        Integer
//        Boolean
//        Byte
//        Float
//        Long
//        Double
//        String
//        StringBuilder
//        StringJoiner
//        StringBuffer

//        BigInteger
//        BigDecimal

        stringFinalTest();
    }

    /**
     * 测试String的不可变性
     *
     * 以下你将可以看到两个hashcode是不一样的，也就是说他们的内存地址是不一样的
     */
    static void stringFinalTest(){
        String s ="hello";
        System.out.println(s.hashCode());
        s ="world";
        System.out.println(s.hashCode());
    }
}
