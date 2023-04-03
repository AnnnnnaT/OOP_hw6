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
        notebook.showAll();
        
    }

    public void start(){
    
        switch (view.start()) {
            case 1:
                addNote();
                break;
            case 2:
                saveNote();
                break;
            case 3:
                showAll();
            default:
                break;
        }
    }


}
