package practice.player;

public class PingpangPlayer extends Player implements SpeakEnglish {
    public PingpangPlayer() {
    }

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
