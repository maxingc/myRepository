package practice;

import java.util.ArrayList;

/*
    Java程序中最基本的组成单位是类
*/
public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("world");
        al.add("hello");
        al.remove("hello");
        al.remove("hello");
        al.remove("hello");
        System.out.println(al);

    }
    }
