package java;

public class Aquarium {

    private int mTemperature;

    public Aquarium() { }

    public int getmTemperature() {
        return mTemperature;
    }

    public void setmTemperature(int mTemperature) {
        this.mTemperature = mTemperature;
    }

    @Override
    public String toString() {
        return "Aquarium{" +
                "mTemperature=" + mTemperature +
                '}';
    }
}
