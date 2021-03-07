package practice.player;

public class PingpangCoach extends Coach implements SpeakEnglish {
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
