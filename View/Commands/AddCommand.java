package View.Commands;

import java.util.Scanner;

public class AddCommand{

    public static void description(){
        System.out.println("Input your note: ");
    }

    public static String input(){
        Scanner input = new Scanner(System.in);
        String newNote = input.next();
        input.close();
        return newNote;
    }
}