package hexlet.code.interfas;

public interface Device {

    static String INTERFACE_NAME = "Device";

    static String getInterfaceName() {
        return INTERFACE_NAME;
    }

    int getRam();

    int getHardDriveMemory();

    default int getSsd() {
        System.out.println("Device.getSsd");
        return 0;
    }
}
