package hexlet.code.pattern;
/**
 * Порождающие паттерны
 * Builder (Строитель)
 */

import lombok.*;

@Setter
@AllArgsConstructor
@Builder(setterPrefix = "with")
public class Computer {
    private int ram;
    private double cpu;
    private int ssd;
    private int hdd;
    private int power;
    private boolean hasCdDrive;
    private String videoAdapterType;


}
