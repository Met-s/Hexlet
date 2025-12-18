package hexlet.code.exercise5;

import java.util.Map;


public class SingleTag extends Tag {

    public SingleTag(String nameTag, Map<String, String> attributesTag) {
        super(nameTag, attributesTag);
    }

    public String toString() {
        if (super.getAttributesTag().isEmpty()) {
            return String.format("<%s>", super.getNameTag());
        }
        return String.format("<%s %s>",
                super.getNameTag(),
                valueTeg(super.getAttributesTag()));
    }
}
