package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
import sample.Controller;

public class Main extends Application {
    public static Controller controller;
    public static SearchController controller1;
    public static LinkedList<Note> notes = new LinkedList<>();
    public static LinkedList<Note> notes_deleted = new LinkedList<>();
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Notes");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }
    @Override
    public void stop() throws IOException {
        Files.writeList();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Files.readNotes(notes, notes_deleted);
        launch(args);
    }
    public static void showNotes(TextArea textColumn, TextArea nameColumn, TextArea numberColumn) {
        int i = 1;
        textColumn.setText("");
        nameColumn.setText("");
        numberColumn.setText("");
        for(Note note: Main.notes_deleted){
            if (note.getDeleted() == false){
                String nameString = TextAnalyze.textDeAnalyze(note.getName());
                String textString = TextAnalyze.textDeAnalyze(note.getText());
                textColumn.appendText(textString + "\n");
                nameColumn.appendText(nameString + "\n");
                numberColumn.appendText(i + "\n");
                i ++;
            }
        }
    }
    public static void showNotesSearch(TextArea textColumn, TextArea nameColumn, TextArea numberColumn, TextArea deletedColumn) {
        int i = 1;
        textColumn.setText("");
        nameColumn.setText("");
        numberColumn.setText("");
        deletedColumn.setText("");

        for(Note note: SearchController.search_result){
            String nameString = TextAnalyze.textDeAnalyze(note.getName());
            String textString = TextAnalyze.textDeAnalyze(note.getText());
            textColumn.appendText(textString + "\n");
            nameColumn.appendText(nameString + "\n");
            numberColumn.appendText(i + "\n");
            if(note.getDeleted() == false){
                deletedColumn.appendText("Not deleted" + "\n");
            }
            if(note.getDeleted() == true){
                deletedColumn.appendText("Deleted" + "\n");
            }
            i ++;
        }
    }
}