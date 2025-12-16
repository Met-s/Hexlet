package hexlet.code.exercise4;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InputTag implements TagInterface {

    private String type;
    private String value;

    @Override
    public String render() {
        return "<input type=\"" + this.type + "\" value=\"" + this.value + "\">";
    }

    @Override
    public String toString() {
        return render();
    }
}
