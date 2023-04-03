package View;

import java.util.Scanner;

import View.Commands.AddCommand;
import View.Commands.SaveNote;
import View.Commands.ShowAllNotes;

public class Menu implements View {

    @Override
    public String addNote() {
        AddCommand.description();
        return AddCommand.input();
    }

    @Override
    public void saveNote() {
       SaveNote.description();
    }

    @Override
    public void showAllNotes() {
       ShowAllNotes.show();       
    }

    @Override
    public int start() {
        System.out.println("Make a note!");
        System.out.println("Choose what to do: ");
        System.out.println("1.Add new note");
        System.out.println("2.Save note");
        System.out.println("3.Show all notes");
        Scanner toDo = new Scanner(System.in);
        int choice = toDo.nextInt();
        return choice;
    }
    
}
