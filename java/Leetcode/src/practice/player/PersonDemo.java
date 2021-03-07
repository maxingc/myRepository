package practice.player;

import java.util.ArrayList;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        PingpangPlayer ppp = new PingpangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        ppp.eat();
        ppp.study();
        ppp.speakEnglish();
        PingpangPlayer  p = new PingpangPlayer();

        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        for(String s:array) {
            System.out.println(s);
        }
    }
}
