package View.Commands;

import java.util.Arrays;

import Model.Notebook;

public class ShowAllNotes {
    public static void show(Notebook notebook){
        System.out.println("All notes: ");
        System.out.println(Arrays.toString(notebook.notebookToArray()));
    }

   
}
