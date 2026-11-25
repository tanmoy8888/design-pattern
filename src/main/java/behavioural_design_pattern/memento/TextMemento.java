package behavioural_design_pattern.memento;

public class TextMemento {
    private String textMemento;

    public TextMemento(String textMemento){
        this.textMemento = textMemento;
    }

    public TextMemento savedString(String textMemento){
        this.textMemento += textMemento;
        return new TextMemento(this.textMemento);
    }

    @Override
    public String toString() {
        return "TextMemento{" +
                "textMemento='" + textMemento + '\'' +
                '}';
    }
}
