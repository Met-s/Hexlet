package hexlet.code.exercise5;

import java.util.Map;
import java.util.List;


public class PairedTag extends Tag{

    private String bodyTag;
    private List<Tag> singleTags;

    public PairedTag(String nameTag,
                     Map<String, String> attributesTag,
                     String bodyTag,
                     List<Tag> singleTags) {
        super(nameTag, attributesTag);
        this.bodyTag = bodyTag;
        this.singleTags = singleTags;
    }

    public String toString(){

        if (super.getAttributesTag().isEmpty() && bodyTag.isEmpty() && singleTags.isEmpty()){
            return String.format("<%s></%s>", super.getNameTag(), super.getNameTag());
        }
        if (singleTags.isEmpty()){

            return String.format("<%s %s>%s</%s>",
                    super.getNameTag(),
                    valueTeg(super.getAttributesTag()),
                    bodyTag,
                    super.getNameTag());
        }

        return String.format("<%s %s>%s%s</%s>",
                super.getNameTag(),
                valueTeg(super.getAttributesTag()),
                singleTags.get(0),
                singleTags.get(1),
                super.getNameTag());
    }

}
