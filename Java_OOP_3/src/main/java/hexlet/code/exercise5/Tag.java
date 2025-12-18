package hexlet.code.exercise5;

import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.Map;

@Getter
@Setter
public class Tag {

    private String nameTag;
    private Map<String, String> attributesTag;

    public Tag(String nameTag, Map<String, String> attributesTag) {
        this.nameTag = nameTag;
        this.attributesTag = attributesTag;
    }

    public String valueTeg(Map<String, String> attributes) {

        String result = "";

        Iterator<Map.Entry<String, String>> iterator = attributes.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            result += entry.getKey() + "=\"" + entry.getValue() + "\"";
            if (iterator.hasNext()) {
                result += " ";
            }
        }
        return result;
    }
}
