package Comp;

public class HardDisk {
    private TypeHard typeHard;
    private int volumeHard;
    private double weight;

    public HardDisk(TypeHard typeHard, int volumeHard, double weight) {
        this.typeHard = typeHard;
        this.volumeHard = volumeHard;
        this.weight = weight;
    }

    public TypeHard getTypeHard() {
        return typeHard;
    }

    public void setTypeHard(TypeHard typeHard) {
        this.typeHard = typeHard;
    }

    public int getVolumeHard() {
        return volumeHard;
    }

    public void setVolumeHard(int volumeHard) {
        this.volumeHard = volumeHard;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nтип диска " + typeHard + "\nобьём памяти диска " + volumeHard + "\nвес диска " + weight;
    }
}