package Comp;

public class Ram {
    private TypeRam type;
    private VolumeRam volume;
    private double wei;

    public Ram(TypeRam type, VolumeRam volume, double wei) {
        this.type = type;
        this.volume = volume;
        this.wei = wei;
    }

    public TypeRam getType() {
        return type;
    }

    public void setType(TypeRam type) {
        this.type = type;
    }

    public VolumeRam getVolume() {
        return volume;
    }

    public void setVolume(VolumeRam volume) {
        this.volume = volume;
    }

    public double getWei() {
        return wei;
    }

    public void setWei(double wei) {
        this.wei = wei;
    }

    @Override
    public String toString() {
        return "\nтип памяти " + type + "\nобьём памяти " + volume + "\nвес оперативки " + wei;
    }
}
