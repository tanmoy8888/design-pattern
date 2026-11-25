package behavioural_design_pattern.memento;

public class MainCaller {
    public static void main(String[] args) {
        TextHistory history = new TextHistory();
        TextEditor editor = new TextEditor(history);
        editor.write("Hello");
        editor.write("World");
        history.getHistory();
        editor.write(" , have a good day.");
        history.getHistory();
        editor.restore();
        history.getHistory();

    }
}
