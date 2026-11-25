package behavioural_design_pattern.memento;

public class MainCaller {
    public static void main(String[] args) {
        TextHistory history = new TextHistory();
        TextEditor editor = new TextEditor(history);
        editor.write("Hello");
        editor.save();
        editor.write("World");
        history.getHistory();
        editor.write(" , have a good day.");
        editor.save();
        history.getHistory();
        editor.restore();
        editor.save();
        history.getHistory();

    }
}
