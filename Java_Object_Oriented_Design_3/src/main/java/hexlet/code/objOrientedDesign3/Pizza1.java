package hexlet.code.objOrientedDesign3;

import lombok.Builder;
import lombok.Getter;
// CHECKSTYLE:OFF: Javadoc comment
/**
 Java: Объектно-ориентированный дизайн
 ###_____ Модуль Билдер (Builder) ____###
 №_1
 */
// CHECKSTYLE:ON: Javadoc comment
@Builder
@Getter
public final class Pizza1 {

    private String size;
    private String dough;
    private String sauce;
    private String meatTopping;
    private String vegetableTopping;
    private String cheeseTopping;
}
