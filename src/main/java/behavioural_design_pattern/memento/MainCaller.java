package behavioural_design_pattern.memento;

public class MainCaller {
    public static void main(String[] args) {
        TextHistory history = new TextHistory();
        TextEditor editor = new TextEditor(history);
        editor.write("Hello");
        editor.save();
        history.getHistory();
        editor.write("World");
        editor.save();
        history.getHistory();
        editor.write(" , have a good day.");
        editor.save();
        history.getHistory();
        editor.restore();
        history.getHistory();

    }
}
