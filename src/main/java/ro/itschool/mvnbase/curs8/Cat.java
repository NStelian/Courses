package ro.itschool.mvnbase.curs8;

public class Cat extends Pet {
    private String voice;
    private int noOfLimbs;

    public Cat(){
        this.voice="MiauMiau";
        this.noOfLimbs=4;
    }

    @Override
    public String voice() {
        return voice;
    }

    @Override
    public int noOfLimbs() {
        return noOfLimbs;
    }
}
