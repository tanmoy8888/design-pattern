package behavioural_design_pattern.memento;

public class TextEditor {
    private String text;
    private TextHistory textHistory;

    public TextEditor(TextHistory textHistory){
        this.textHistory = textHistory;
    }

    public String write(String write){
        this.text +=write;
        return this.text;
    }
    public void save(){
        this.textHistory.saveState(new TextMemento(this.text));
    }
    public void restore(){
        this.textHistory.undo();
    }
}
