package Presenter;

import Model.Notebook;
import View.View;



public class Presenter {
    private View view;
    private Notebook notebook;
    
    public Presenter(View view, Notebook notebook){
        this.notebook = notebook;
        this.view = view;
    }

    void addNote(){        
        notebook.addNote(view.addNote());
    }

    void saveNote(){
        view.saveNote();
        notebook.save();
    }

    void showAll(){
        view.showAllNotes();        
    }

    


}
