package Comp;

public class Keybord {
    private TypeKeyboard keyboard;
    private BlackLight blackLight;
    private double weight;

    public Keybord(TypeKeyboard keyboard, BlackLight blackLight, double weight) {
        this.keyboard = keyboard;
        this.blackLight = blackLight;
        this.weight = weight;
    }

    public TypeKeyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(TypeKeyboard keyboard) {
        this.keyboard = keyboard;
    }

    public BlackLight getBlackLight() {
        return blackLight;
    }

    public void setBlackLight(BlackLight blackLight) {
        this.blackLight = blackLight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nтип клавы " + keyboard + "\nналичие подсветки " + blackLight + "\nвес клавы " + weight;
    }
}