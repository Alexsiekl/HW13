import Comp.BlackLight;
import Comp.Computer;
import Comp.Fryquency;
import Comp.HardDisk;
import Comp.Keybord;
import Comp.Manufact;
import Comp.Monitor;
import Comp.Nuclear;
import Comp.Processor;
import Comp.Ram;
import Comp.TypeHard;
import Comp.TypeKeyboard;
import Comp.TypeMonitor;
import Comp.TypeRam;
import Comp.VolumeRam;

public class Main {
    public static void main(String[] args) {
Computer computer1 = new Computer(new Processor(Fryquency.MIDDLEFRY, Nuclear.FOURCLEAR, Manufact.INTEL, 2.4),new Ram(TypeRam.DDR3, VolumeRam.HIGHTVOLUME,45.8) ,new HardDisk(TypeHard.SDD,512,249.3), new Monitor(17.3, TypeMonitor.TN,1893.2), new Keybord(TypeKeyboard.SENSORY, BlackLight.WITHBLACKLIGHT, 287.4));
        System.out.println("Общий вес получившегося компьютера " + computer1.weithComp() + " грамм");
        System.out.println(computer1.toString());
    }
}