package sample;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Files {

    public static void readNotes(LinkedList<Note> notes, LinkedList<Note> notes_deleted) throws FileNotFoundException {
        Scanner sc1;
        String s;
        sc1 = new Scanner(new File("notes.txt"));
        String[] s1;
        int i = 1;
        while (sc1.hasNextLine()) {
            s = sc1.nextLine();
            s1 = s.split(" ");
            Note note = new Note(Boolean.parseBoolean(s1[0]), Integer.parseInt(s1[1]), i, s1[3], s1[4]);
            notes_deleted.add(note);
            if(note.getDeleted() == false){
                notes.add(note);
                i ++;
            }
        }
    }

    public static void writeList() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("notes.txt")),true);
        int i = 1;
        for(Note note: Main.notes_deleted){
            printWriter.println(note.getDeleted() + " " + note.getId() + " " + i + " " + note.getName() + " " + note.getText());
            i ++;
        }
        printWriter.close();
    }
}
