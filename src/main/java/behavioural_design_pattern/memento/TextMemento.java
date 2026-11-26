package behavioural_design_pattern.memento;

public class TextMemento {
    private String textMemento;

    public TextMemento(String textMemento){
        this.textMemento = textMemento;
    }

    @Override
    public String toString() {
        return "TextMemento{" +
                "textMemento='" + textMemento + '\'' +
                '}';
    }
}
