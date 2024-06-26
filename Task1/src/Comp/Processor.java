package Comp;

public class Processor {
    private Fryquency fryq;
    private Nuclear nuc;
    private Manufact manuf;
    private double weith;

    public Processor(Fryquency fryq, Nuclear nuc, Manufact manuf, double weith) {
        this.fryq = fryq;
        this.nuc = nuc;
        this.manuf = manuf;
        this.weith = weith;
    }

    public double getWeith() {
        return weith;
    }

    public void setWeith(double weith) {
        this.weith = weith;
    }

    @Override
    public String toString() {
        return "\nчастота проца " + fryq + "\nколичество ядер " + nuc + "\nпроизводитель " + manuf + "\nвес проца " + weith;
    }
}
