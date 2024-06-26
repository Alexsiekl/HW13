package Comp;

public class Computer {
    public static final String vendor = "INTEL";
    public static final String name = "Hp";
    private Processor proc;
    private Ram ram;

    private HardDisk disk;
    private Monitor mon;
    private Keybord board;

    public Computer(Processor proc, Ram ram, HardDisk disk, Monitor mon, Keybord board) {
        this.proc = proc;
        this.ram = ram;
        this.disk = disk;
        this.mon = mon;
        this.board = board;
    }

    public double weithComp() {
        return proc.getWeith() + ram.getWei() + disk.getWeight() + mon.getWeigt() + board.getWeight();
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDisk getDisk() {
        return disk;
    }

    public void setDisk(HardDisk disk) {
        this.disk = disk;
    }

    public Monitor getMon() {
        return mon;
    }

    public void setMon(Monitor mon) {
        this.mon = mon;
    }

    public Keybord getBoard() {
        return board;
    }

    public void setBoard(Keybord board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "производитель компа " + vendor + "\nназвание компа " + name + proc.toString() + ram.toString() + disk.toString() + mon.toString() + board.toString();
    }
}