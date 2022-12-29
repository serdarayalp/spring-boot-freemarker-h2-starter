package de.mydomain.freemarker.model;

public class Car {

    private final String marke;
    private final String model;
    private final int zulassung;

    public Car(String marke, String model, int zulassung) {
        this.marke = marke;
        this.model = model;
        this.zulassung = zulassung;
    }

    public String getMarke() {
        return marke;
    }

    public String getModel() {
        return model;
    }

    public int getZulassung() {
        return zulassung;
    }
}
