package ro.itschool.mvnbase.Curs7.light;

public class LightBulb implements Lumineers {
    boolean light;

    @Override
    public void on() {
        light = true;
    }

    @Override
    public void off() {
        light = false;
    }

    @Override
    public boolean isLit() {
        return light;
    }
}
