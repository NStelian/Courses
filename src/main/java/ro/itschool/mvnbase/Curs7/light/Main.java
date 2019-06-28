package ro.itschool.mvnbase.Curs7.light;

public class Main {
    public static void main(String[] args) {
        OilLamp lamp = new OilLamp();
        lamp.on();
        getStatus(lamp);
        lamp.off();
        getStatus(lamp);

        LightBulb bulb = new LightBulb();
        bulb.on();
        getStatus(bulb);
        bulb.off();
        getStatus(bulb);

    }

    private static void getStatus(Lumineers lumineer){
        System.out.println(lumineer.isLit());
    }
}
