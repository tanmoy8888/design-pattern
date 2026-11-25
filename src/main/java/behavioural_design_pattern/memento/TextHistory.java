package behavioural_design_pattern.memento;

import java.util.ArrayList;
import java.util.List;

public class TextHistory {
    private List<TextMemento> list;

    public TextHistory(){
        this.list = new ArrayList<>();
    }

    public void saveState(TextMemento textMemento){
        this.list.add(textMemento);
    }

    public TextMemento undo(){
        if (list.isEmpty()) {
            return null;
        }

        list.remove(list.size() - 1);

        if (list.isEmpty()) {
            return null;
        }

        return list.get(list.size() - 1);
    }

    public void getHistory(){
        System.out.println("------------Get History called---------------");
        System.out.println("Text Editor History = " + list);
        System.out.println("------------Get History called---------------");
    }
}
