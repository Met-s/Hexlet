package hexlet.code.interfas;

public class PC implements Device {

    @Override
    public int getRam() {
        System.out.println("PC.getRAM");
        return 0;
    }

    public int getHardDriveMemory() {
        System.out.println("PC.getHardDriveMemory");
        return 0;
    }

    public int getProcessor() {
        System.out.println("PC.getProcessor");
        return 0;
    }
}
