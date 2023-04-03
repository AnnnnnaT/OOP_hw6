package Model;

import java.util.*;

import Model.Possibilities.AddNote;
import Model.Possibilities.Save;
import Model.Possibilities.ShowAll;

public class Notebook implements AddNote, Save, ShowAll {
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

    @Override
    public void showAll() {
        System.out.println(Arrays.toString(notebook.toArray()));
    }

}
