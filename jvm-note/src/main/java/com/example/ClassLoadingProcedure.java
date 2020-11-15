package com.example;

public class ClassLoadingProcedure {

    public static void main(String[] args) {
        System.out.println(T.count);
    }

}

class T{
    //3
//    public static int count = 2;
//    public static T t = new T();

    //2
    public static T t = new T();
    public static int count = 2;

    private T(){
        count++;
        System.out.println("---" + count);
    }
}