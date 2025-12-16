package hexlet.code.exercise4;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LabelTag implements TagInterface {

    private String teg;
    private TagInterface childTag;

    @Override
    public String render() {

        return "<label>" + teg + childTag.render() + "</label>";
    }
}
