package hexlet.code.interfas;

public class Laptop implements Screen {

    @Override
    public int getDpi() {
        System.out.println("Laptop DPI");
        return 0;
    }

    @Override
    public int getRam() {
        System.out.println("Laptop RAM");
        return 0;
    }

    @Override
    public int getHardDriveMemory() {
        System.out.println("Laptop Hard Drive Memory");
        return 0;
    }

    @Override
    public int getSsd() {
        System.out.println("Laptop.getSsd");
        return 1;
    }
}
