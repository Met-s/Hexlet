package hexlet.code.objOrientedDesign3;

import lombok.Builder;
import lombok.Data;
// CHECKSTYLE:OFF: Javadoc comment
/**
 Java: Объектно-ориентированный дизайн
 ###_____ Модуль Билдер (Builder) ____###
 №_1
 */
// CHECKSTYLE:ON: Javadoc comment
@Builder
@Data
public class Car {
    private String model;
    private String engine;
    private String interior;
    private boolean hasSunroof;
    @Builder.Default
    private String color = "Black";
}
