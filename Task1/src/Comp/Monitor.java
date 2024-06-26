package Comp;

public class Monitor {
    private double diag;
    private TypeMonitor typeMon;
    private double weigt;

    public Monitor(double diag, TypeMonitor typeMon, double weigt) {
        this.diag = diag;
        this.typeMon = typeMon;
        this.weigt = weigt;
    }

    public double getDiag() {
        return diag;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }

    public TypeMonitor getTypeMon() {
        return typeMon;
    }

    public void setTypeMon(TypeMonitor typeMon) {
        this.typeMon = typeMon;
    }

    public double getWeigt() {
        return weigt;
    }

    public void setWeigt(double weigt) {
        this.weigt = weigt;
    }

    @Override
    public String toString() {
        return "\nдиагональ " + diag + "\nтип монитора " + typeMon + "\nвес монитора " + weigt;
    }
}