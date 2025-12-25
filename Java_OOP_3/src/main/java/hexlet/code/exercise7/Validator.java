package hexlet.code.exercise7;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {

    public static List<String> validate(Address address) {
        List<String> result = new ArrayList<>();
        Class<?> aClass = address.getClass();

        Field[] fields = aClass.getDeclaredFields();

        try {
            for (Field field : fields) {

                var fieldName = field.getName();
                field.setAccessible(true);
                var fieldValue = field.get(address);
                if (field.isAnnotationPresent(NotNull.class) && fieldValue == null) {
                    result.add(fieldName);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
}
