package ro.itschool.mvnbase.curs8;

public class Dog extends Pet {
    private String voice;
    private int noOfLimbs;

    public Dog(){
        this.voice="HamHam";
        this.noOfLimbs=4;
    }

    public String voice(){
        return voice;
    }

    public int noOfLimbs(){
        return noOfLimbs;
    }
}
