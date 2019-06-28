package ro.itschool.mvnbase.Curs7.light;

public class OilLamp implements Lumineers {
    boolean burn;

    @Override
    public void on() {
        burn = true;
    }

    @Override
    public void off() {
        burn = false;
    }

    @Override
    public boolean isLit() {
        return burn;
    }
}
