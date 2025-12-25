package hexlet.code.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Видимость аннотации: SOURCE, CLASS, RUNTIME
@Target(ElementType.METHOD) // Типы аннотируемых элементов: TYPE, FIELD, METHOD, PARAMETER и пр.
public @interface Cmd {
    String name();  // Параметры аннотаций
    String description();
}
