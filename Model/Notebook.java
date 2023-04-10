package Model;

import java.lang.reflect.Array;
import java.util.*;

import Model.Possibilities.AddNote;
import Model.Possibilities.Save;

public class Notebook implements AddNote, Save {
    ArrayList<String> notebook;

    public Notebook() {
        this.notebook = new ArrayList<>();
    }

    @Override
    public void addNote(String note) {
        notebook.add(note);
    }

    @Override
    public void save() {

        System.out.println("Your last note is saved");

    }

    public Object[] notebookToArray() {         
        return notebook.toArray();
    }

    
}
