package ro.itschool.mvnbase.curs8;

public class Bird extends Pet {
    private String voice;
    private int noOfLimbs;

    public Bird(){
        this.voice="CraCra";
        this.noOfLimbs=2;
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
