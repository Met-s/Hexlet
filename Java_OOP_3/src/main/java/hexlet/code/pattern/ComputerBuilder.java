package hexlet.code.pattern;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * Порождающие паттерны
 * Builder (Строитель)
 */

public class ComputerBuilder {
    private int ram;
    private double cpu;
    private int ssd;
    private int hdd;
    private int power;
    private boolean hasCdDrive;
    private String videoAdapterType;

    public ComputerBuilder withRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder withCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder withSsd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    public ComputerBuilder withHdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder withPower(int power) {
        this.power = power;
        return this;
    }

    public ComputerBuilder withHasCdDrive(boolean hasCdDrive) {
        this.hasCdDrive = hasCdDrive;
        return this;
    }

    public ComputerBuilder withVideoAdapterType(String videoAdapterType) {
        this.videoAdapterType = videoAdapterType;
        return this;
    }

    public Computer build() {
        return new Computer(ram, cpu, ssd, hdd, power, hasCdDrive, videoAdapterType);
    }
}
