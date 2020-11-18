package com.example;

public class JVM_ByteCode {


    public static void main(String[] args) {
        JVM_ByteCode jvm_byteCode = new JVM_ByteCode();
        jvm_byteCode.sum(10);
    }

    public int sum(int i){
        return i + 1;
    }
}
