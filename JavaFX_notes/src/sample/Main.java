package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import sample.Controller;

public class Main extends Application {
    public static Controller controller;
    public static LinkedList<Note> notes = new LinkedList<>();
    public static FileWriter fileWriter;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Notes");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }


    public static void main(String[] args) throws FileNotFoundException {
        readNotes(notes);
        launch(args);
    }

    public static void readNotes(LinkedList<Note> notes) throws FileNotFoundException {
        Scanner sc1;
        String s;
        sc1 = new Scanner(new File("notes.txt"));
        String[] s1;
        while (sc1.hasNextLine()) {
            s = sc1.nextLine();
            s1 = s.split(" ");
            Note note1 = new Note(Integer.parseInt(s1[0]), s1[1], s1[2]);
            notes.add(note1);
        }
    }
    public static void writeNotes(Note note) throws IOException {
        fileWriter = new FileWriter("notes.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\n" + note.getNumber() + " " + " " + note.getName() + " " + note.getText());
        bufferedWriter.close();
    }
    public static void textAreaFilling(TextArea text) {
        text.setText("");
        for(Note note: notes){
            text.appendText(note.getNumber() + " " + note.getName() + " " + note.getText() + "\n");
        }
    }
    public static Note findNote(int i){
        for (Note note: notes){
            if (note.getNumber() == i){
                return note;
            }
        }
        return null;
    }
}
