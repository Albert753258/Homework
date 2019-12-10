package sample;

import javafx.scene.control.TextArea;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class Files {
    public static FileWriter fileWriter;
    public static BufferedWriter bufferedWriter;


    public static void writeNotes(Note note) throws IOException {
        fileWriter = new FileWriter("notes.txt", true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n" + note.getDeleted() + " " + note.getId() + " " + note.getNumber() + " " + note.getName() + " " + note.getText());
        bufferedWriter.close();
    }
    public static void showNotes(TextArea text) {
        text.setText("");
        for(Note note: Main.notes){
            if (note.getDeleted() == false){
                if (note.getDeleted() == false){
                    text.appendText(note.getNumber() + " " + note.getName() + " " + note.getText() + "\n");
                }
            }
        }
    }
    public static void readNotes(LinkedList<Note> notes) throws FileNotFoundException {
        Scanner sc1;
        String s;
        sc1 = new Scanner(new File("notes.txt"));
        String[] s1;
        while (sc1.hasNextLine()) {
            s = sc1.nextLine();
            s1 = s.split(" ");
            Note note = new Note(Boolean.parseBoolean(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]), s1[3], s1[4]);
            notes.add(note);
        }
    }

    public static void writeList() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("notes.txt")),true);
        for(Note note: Main.notes){
            printWriter.println(note.getDeleted() + " " + note.getId() + " " + note.getNumber() + " " + note.getName() + " " + note.getText());
        }
        printWriter.close();
    }
}
